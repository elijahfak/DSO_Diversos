<%-- 
    Document   : registro
    Created on : 09/06/2014, 10:14:01
    Author     : Elizeu
--%>

<%@page import="Controle.EventoPersistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //EventoPersistencia.populadados();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id='corpo'>
            <h1>Cadastro usuario</h1>
            <form method='POST' action='Cadastro'>
                <label>Login</label>
                <input type='text' name='login' />
                <label>Senha</label>
                <input type='password' name='senha' />
                <label>Repita Senha</label>
                <input type='password' name='senha2' />
                <input type='submit' value='Entrar' />
            </form>
        </div>
    </body>
</html>
