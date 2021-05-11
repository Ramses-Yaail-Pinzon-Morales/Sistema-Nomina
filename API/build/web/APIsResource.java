/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.proyecto.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import java.sql.*;

/**
 * REST Web Service
 *
 * @author ShellyOdin21
 */
@Path("Nomina")
public class APIsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of APIsResource
     */
    public APIsResource() {
    }

    /**
     * Retrieves representation of an instance of com.api.proyecto.rest.APIsResource
     * @return an instance of java.lang.String
     */
    
    @GET
    @Path("Java")
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<h1>Hola mundo</h1>"
                +"<input></input>";
    }

    /**
     * PUT method for updating or creating an instance of APIsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
        
    }
    
    @GET
    @Path("Salario")
    @Produces(MediaType.TEXT_HTML)
    public String getHtmlSalario() {
        return "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"<title>Sistema Nómina</title>\n" +
"<h3 style=\"text-align:left; color:black; background-color: rgb(153,204,255); font-size:30px; text-decoration:Shadow\">Pay Roll</h3>\n" +
"<meta charset=\"UTF-8\">\n" +
"<meta name=\"viewport\" content=\"width=divce-width, initial-scale=1.0\">\n" +
"</head>\n" +
"</html>";
    }
}
