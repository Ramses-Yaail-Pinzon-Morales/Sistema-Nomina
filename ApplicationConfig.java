/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.proyecto.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ShellyOdin21
 * 13 Abril 2021
 * API para proyecto de Ing. Software - Ejemplo.
 */

@javax.ws.rs.ApplicationPath("Sistema")
public class ApplicationConfig extends Application{
    @Override
    public Set<Class<?>> getClasses()   {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources)    {
        resources.add(com.api.proyecto.rest.APIsResource.class);
    }

}
