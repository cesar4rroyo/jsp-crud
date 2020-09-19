<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.ResultSet"
        import="java.sql.Statement"
        import="java.sql.SQLException"
        %>
<%
    Connection con = null;
    Statement sql = null;
    try {

        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/gas", "root", "alianza");
        sql = con.createStatement();
        out.print("CONEXION ESTABLECIDA");

    } catch (Exception e) {
        out.print("ERROR EN LA CONEXION" + e);
    }
%>