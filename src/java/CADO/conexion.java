/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CADO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
    private Connection cnx;

    public Connection getCnx() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/gas","unprg" , "password");
            return cnx;
            
        }catch(Exception e){
            return null;
        }
    }

     public void ejecutarInsertUbdateDelete(String consultasSQL) throws SQLException{
        Statement st = this.getCnx().createStatement();
        st.executeUpdate(consultasSQL);
     }
        
     public ResultSet ejecutarLista(String consulta) throws SQLException{
        Statement st = this.getCnx().createStatement();
        ResultSet rs = st.executeQuery(consulta);
        return rs;
    } 
}
