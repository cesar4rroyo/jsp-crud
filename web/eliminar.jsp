<%@page import="modelo.mProvedor"%>
<%@page import="CADO.conexion"%>
<%

    int id_eliminar = Integer.parseInt(request.getParameter("id"));
    mProvedor oprovedor = new mProvedor();
    oprovedor.eliminar(id_eliminar);
    request.getRequestDispatcher("provedor.jsp").forward(request, response);


%>

