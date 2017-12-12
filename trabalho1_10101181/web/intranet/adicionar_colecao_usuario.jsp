<%@page import="Controle.EventoPersistencia"%>
<%@include  file="../includes/verifica_sessao.jsp" %>
<%
    String login2 = (String) session.getAttribute("login");
    int idItem = Integer.parseInt(request.getParameter("id_item"));
    Controle.EventoPersistencia.set_item_colecao_usuario(login2, idItem);
    
    response.sendRedirect("index.jsp");
%>