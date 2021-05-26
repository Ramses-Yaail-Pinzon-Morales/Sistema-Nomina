/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var mysql      = require('mysql');

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'ShellyOdin21',
  database : 'basesmvc'
});
 
connection.connect(function(error){
    if(error){
        throw error;
    } else {
        console.log('Conexión Realizada con éxito, ya puedes programar aquí.');
    }
});
 

/*connection.query('SELECT 1 + 1 AS solution', function (error, results, fields) {
  if (error) throw error;
  console.log('The solution is: ', results[0].solution);
});*/

connection.query('SELECT * FROM cliente', function(error, results, fields){
    if (error){
        throw error;
    } else {
        console.log(results);
    }
});

/*connection.query('INSERT INTO cliente VALUES (2,"Ram@gmail.com",4321)',function(error, results, fields){
    if (error) {
        throw error;
    } else {
        console.log(results + "Se ha agregado éxitosamente.");
    }
});*/

/*connection.query('SELECT correo FROM cliente', function (error, results, fields){
   if (error){
       throw error;
   } else {
       console.log(results[1]);
   }
});*/
var Usuario ="Ram@gmail.com";
var Contra = "4321";
connection.query('SELECT * FROM cliente WHERE correo=? AND contraseña=?',[Usuario,Contra], function (error, results){
   if(error){
       throw error;
   } else {
       var a = results;
       if (a.length >0){
           console.log("Bienvenido "+Usuario);
       } else {
           console.log("No encontrado en la base de datos");
           //console.log(a);
       }
   }
});

connection.end();


