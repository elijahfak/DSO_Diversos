<%@page import="Controle.EventoPersistencia"%>
<%@page import="Controle.Evento"%>
<%
    EventoPersistencia.populadados();

    response.sendRedirect("../index.jsp");

%>