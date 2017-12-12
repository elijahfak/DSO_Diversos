function autenticacao_usuario() {
    $.ajax({
        url: 'intra/logon.jsp',
        async: true,
        type: 'POST',
        data: {
            login: $('input[name="login"]').val(),
            senha: $('input[name="senha"]').val()
        },
        complete: function(jqXHR, textStatus) {
            var resposta = JSON.parse(jqXHR.responseText);
            
            console.log(resposta);
            
            if(resposta.data === undefined){
                location.href='intra/index.jsp';
            }else{
                alert('Erro!');
            }
        }
    });
}