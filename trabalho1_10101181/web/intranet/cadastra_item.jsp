<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="Modelo.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controle.EventoPersistencia"%>
<%@include  file="../includes/verifica_sessao.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id='corpo'>
            <%@include  file="../includes/cabecalho.jsp" %>
            <form method='POST' action='../CadastraItem'>
                <label>Nome: </label>
                <input type="text" name="nome" />
                <label>Autor: </label>
                <input type="text" name="autor" />

                <label>Tipo </label>
                <select name="tipo">
                    <option value="1">Livro</option>
                    <option value="2">Musica</option>
                    <option value="3">Filme</option>
                </select>

                <input type="submit" value="cadastrar" />
            </form>
        </div>
    </body>
</html>

