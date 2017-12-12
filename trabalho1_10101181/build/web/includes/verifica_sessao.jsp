<%
    String login = (String) session.getAttribute("login");
    if (login == null) {
        response.sendRedirect("../index.jsp?nao_logado=true");
    }
%>
