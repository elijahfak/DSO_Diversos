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
            <ul>
                <h3>Minhas Coleções</h3>
                <%                    ArrayList<Integer> idJaTem = new ArrayList();
                    try {
                        ArrayList<Item> colecaousuario = EventoPersistencia.get_colecao_usuario(login);
                        for (int i = 0; i < colecaousuario.size(); i++) {
                            if (colecaousuario.get(i) != null) {
                                idJaTem.add(colecaousuario.get(i).getId());
                                out.println("<li><a href='remover_colecao_usuario.jsp?id_item=" + colecaousuario.get(i).getId() + "'>Remover</a> " + colecaousuario.get(i).getNome() + "</li>");
                            }
                        }
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                %>
            </ul>

            <ul>
                <h3>Acervo Disponível</h3>
                <%                    try {
                        HashMap<Integer, Item> acervo = EventoPersistencia.get_colecao();
                        Set<Integer> chaves = acervo.keySet();
                        //ArrayList<Item> colecaousuario = EventoPersistencia.get_colecao_usuario(login);

                        for (Integer chave : chaves) {

                            if (!idJaTem.contains(acervo.get(chave).getId())) {
                                out.println("<li>");
                                //if (!colecaousuario.contains(acervo.get(chave).getId())) {
                                out.println("<a href='adicionar_colecao_usuario.jsp?id_item=" + acervo.get(chave).getId() + "'>"
                                        + "Adicionar ao acervo"
                                        + "</a>");
                                //}

                                out.println(acervo.get(chave).getNome() + "</li>");
                            }
                        }
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                %>
            </ul>
        </div>
    </body>
</html>
