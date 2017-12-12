<!DOCTYPE html>
<html>
    <head>
        <title>CD's, DVD's, videos, Shows, Desenhos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div id='corpo'>
            <%
                try {
                    String nao = request.getParameter("nao_logado");
                    if (!nao.equals("")) {
                        out.println("<div id='nao_logado'>É necessario estar logado para acessar a área privada</div>");
                    }
                } catch (Exception e) {
                    //nao faz nada
                }
            %>

            <form method='POST'>
                <label>Login</label>
                <input type='text' name='login' />
                <label>Senha</label>
                <input type='password' name='senha' />
                <input type='button' onclick="autenticavao_usuario();" value='Entrar' />
            </form>
            <div id='esqueci_minha_senha'>
                <a href='registro.jsp'>Registre-se</a> <br /><br /><br /><br /><br />
                
                <a href='includes/popular.jsp'>Popular Base</a>
            </div>
        </div>
    </body>
</html>
