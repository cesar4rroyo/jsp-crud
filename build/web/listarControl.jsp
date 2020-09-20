<jsp:useBean class="modelo.mProvedor" scope="page" id="oProvedor"/>
<%    
    String pboton = request.getParameter("boton");
        
    if(pboton.equals("Listar"))
    {    
        request.setAttribute("odatos", oProvedor.listar());
        request.getRequestDispatcher("provedorLista.jsp").forward(request, response);
       
    }    
%>