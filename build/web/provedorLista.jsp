<jsp:useBean class="java.util.ArrayList" scope="request" id="odatos"/>
<%@page import="java.util.Iterator"%>
<%@page import="beans.beanProvedor"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    try {
        if (!odatos.isEmpty()) {
            Iterator<beanProvedor> it = odatos.iterator();
%>
<table border="1">
    <tr>
        <th>ID</th>
        <th>ZONA</th>
        <th>ID</th>
        <th>ZONA</th>
        <th>ZONA</th>

    </tr>        
    <%while (it.hasNext()) {
            beanProvedor oProvedor = it.next();
    %>
    <tr>
        <td><%=oProvedor.getId_Provedor()%></td>
        <td><%=oProvedor.getNombre()%></td>
        <td><%=oProvedor.getRuc()%></td>
        <td><%=oProvedor.getTelefono()%></td>
        <td><%=oProvedor.getDireccion_provedor()%></td>
    </tr>
    <%
                }
            }
        } catch (Exception e) {
            out.print("Error ... " + e.getMessage());
        }
    %>
</table>
