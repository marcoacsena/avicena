<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="PaginaInicial.css">
        <title>Tela de Cadastro</title>
    </head>
    <body>

        <div class="principal">
            <div class="secao3">
            </div>

            <div class="cadastro">
                <fieldset><legend>Insira os Dados, a seguir, para cadastrar novo Usuário</legend><br><br>
                    <form action="usuario" method="post">
                        <input type="hidden" id="cadastrar" name="cadastrar" value="cadastrar">
                        Nome: 
                        <input type="text" name="nome" required=""><br><br>
                        Senha: 
                        <input type="password" name="senha" required=""><br><br>
                        <input type="submit" value="Cadastrar"><br><br>
                    </form>      
                    <form action="sairdosistema" method="post">
                        <input type="submit" value = "sair">
                    </form> 
                </fieldset>

            </div>     

            <%
                Object obj1 = request.getAttribute("usuariocadastrado");
                Object obj2 = request.getAttribute("usuariovalidado");

                if (obj1 != null) {
                    Boolean usuariocadastrado = (Boolean) obj1;

                    if (!usuariocadastrado) {%>

            <input type="text" size="100" value="<% out.println("Não foi possível cadastrar o novo Usuário, pois já existe um cadastro com esse nome. Tente novamente!");%>">

            <%}
                }

                if (obj2 != null) {
                    Boolean usuariovalidado = (Boolean) obj2;
                    if (!usuariovalidado) {%>
            <br><br><br>
            <input type="text" size="100" value="<% out.println("Não foi possível validar o Usuário. Você precisa se cadastrar para acessar o sistema Avicena!");%>">

            <%}
                }%>
            <div class="secao4">

            </div>
            <footer class="footer">                
                &copy; Desenvolvido por Luciane Benetti e Marco Sena.
            </footer>
        </div>   

    </body>
</html>
