<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Avalie um estabelecimento</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/padrao.js"></script>
    </head>
    <body>
        <form method="post">
            <ul>
                <li><label>Login: </label><input type="text" name="login" /></li>
                <li><label>Senha:</label><input type="password" name="senha" /></li>
                <li><input type="button" onclick="autenticacao_usuario();" value="Entrar" /></li>
            </ul>
            <a href="esqueci_minha_senha.html">Esqueci minha senha</a>
            <a href="cadastrar_me.html">Cadastrar-me</a>
        </form>
    </body>
</html>
