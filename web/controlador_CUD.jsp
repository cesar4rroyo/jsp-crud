<%@page import="modelo.mProvedor"%>
<%
    int id = Integer.parseInt(request.getParameter("txtId"));
    String nombre = request.getParameter("txtNombre");
    String ruc = request.getParameter("txtRuc");
    String telefono = request.getParameter("txtTelefono");
    String direccionProv = request.getParameter("txtDireccion");
    String buttonGrabar = request.getParameter("btnGrabar");

    if (request.getParameter("btnEditar") != null) {
        mProvedor oprovedor = new mProvedor();
        oprovedor.actualizar(id, nombre, ruc, telefono, direccionProv);
        request.getRequestDispatcher("provedor.jsp").forward(request, response);
    }

    if (buttonGrabar.equals("Registrar")) {
        mProvedor oprovedor = new mProvedor();
        oprovedor.insertar(id, nombre, ruc, telefono, direccionProv);
        request.getRequestDispatcher("provedor.jsp").forward(request, response);
        
    }
    
        



%> 