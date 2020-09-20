<%@page import="modelo.mProvedor"%>
<%@page import="CADO.conexion"%>
<%
    int id = Integer.parseInt(request.getParameter("txtId"));
    String nombre = request.getParameter("txtNombre");
    String ruc = request.getParameter("txtRuc");
    String telefono = request.getParameter("txtTelefono");
    String direccionProv = request.getParameter("txtDireccion");
    mProvedor oprovedor = new mProvedor();
    oprovedor.actualizar(id, nombre, ruc, telefono, direccionProv);
    request.getRequestDispatcher("provedor.jsp").forward(request, response);

%>


