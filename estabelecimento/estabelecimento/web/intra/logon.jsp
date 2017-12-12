<%-- 
    Document   : logon
    Created on : 22/06/2014, 17:57:08
    Author     : Elizeu
--%>

<%@page import="com.json.parsers.JSONParser"%>
<%@page import="java.util.Map"%>
<%@page import="com.json.parsers.JsonParserFactory"%>
<%@page import="cliente.WSCon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    String auth = (WSCon.verificaLogin(login, senha));
    //out.println(auth);

    JsonParserFactory factory = JsonParserFactory.getInstance();
    JSONParser parser = factory.newJsonParser();
    Map jsonData = parser.parseJson(auth);

    out.println(auth);
    if (jsonData.containsKey("id")) {
        session.setAttribute("id", jsonData.get("id"));
        session.setAttribute("login", jsonData.get("login"));
        //response.sendRedirect(response.encodeRedirectURL("intra/index.jsp"));
    }

%>