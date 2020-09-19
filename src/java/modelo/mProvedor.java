/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import CADO.CADO;
import CADO.conexion;
import java.sql.SQLException;


/**
 *
 * @author cesar4rroyo
 */
public class mProvedor {

   
    conexion cnx = new conexion();
    
    public String insertar(int id, String nombre, String ruc, String telefono, String direccion_provedor) throws SQLException {

        String sql = "INSERT INTO Provedor (id_Provedor, nombre, ruc, telefono, direccion_provedor) VALUES ('" + id + "', '" + nombre + "', '" + ruc + "', '" + telefono + "', '" + direccion_provedor + "')";
        cnx.ejecutarInsertUbdateDelete(sql);
        return "Insertado Correctamente";
//        CADO ocado = new CADO();
//        ocado.ejecutar(sql);
//        return "Registro insertado correctamente ";

    }
     public String actualizar(int id , String Nombre, String Ruc , String Telefono , String Direccion) throws SQLException {
        String sql = "UPDATE Provedor set nombre = '"+Nombre+"' ,"
                                       + "ruc = '"+Ruc+"',"
                                       + "telefono = '"+Telefono+"',"
                                       + "direccion_provedor = '"+Direccion+"'"
                                       +  "where id_Provedor ="  + id;
        cnx.ejecutarInsertUbdateDelete(sql);
        return "Actualizado Correctamente";
        
    }
    
    public String eliminar(int id) throws SQLException {
        String sql = "Delete from Provedor where id_Provedor = " + id;
        cnx.ejecutarInsertUbdateDelete(sql);
        return "Eliminado Correctamente";
   
    }
   
     public String listar() throws SQLException {
        String sql = "SELECT * from Provedor";
        cnx.ejecutarInsertUbdateDelete(sql);
        return "Listado Correctamente";
        
    }
    
    

}
