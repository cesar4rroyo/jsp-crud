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



public class CADO {
    
    
    private Connection cn;
    
    public Connection getCn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas", 
                    "root", "alianza");
            return cn;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
    //CUD
    public String ejecutar(String sql)
    {
        Statement st;
        try{
            st = this.getCn().createStatement();
            st.executeUpdate(sql);
            return "ok";
        }catch(SQLException e){
            return "Error---> " + e.getMessage();
        }
    }
    //R
    public ResultSet recuperar(String sql)
    {
        Statement st;
        try{
            st = this.getCn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);            
            return st.executeQuery(sql);
        }catch(SQLException e){
            return null;
        }
    }
    
}
