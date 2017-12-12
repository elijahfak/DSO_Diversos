<%-- 
    Document   : cabecalho
    Created on : 09/06/2014, 16:33:01
    Author     : infotv
--%>
<%
    String loginUsuario = (String) session.getAttribute("login");
%>
<div id='cabecalho'>
    <h1 id='mensagem_principal'>Hello: <%=loginUsuario%>, Seja bem-vindo</h1>
    <ul>
        <li><a href='index.jsp'>Inicio</a></li>
        <li><a href='cadastra_item.jsp'>Cadastrar novo item</a></li>
        <li><a href='sair.jsp'>Sair</a></li>
        
    </ul>
</div>