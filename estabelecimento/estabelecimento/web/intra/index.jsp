<%-- 
    Document   : index
    Created on : 22/06/2014, 18:58:56
    Author     : Elizeu
--%>

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../includes/verifica_sessao.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li>Bem Vindo, <% out.println(session.getAttribute("login"));%></li>
            <li><label>Procurar:</label><input type="text" id="procurar_estabelecimento" /><input type="button" id="procurar_estabelecimento_btn" /></li>
            <li><a href="logout.jsp">Sair</a></li>
        </ul>
    </body>
</html>
