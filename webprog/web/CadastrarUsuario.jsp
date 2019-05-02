<%-- 
    Document   : CadastrarUsuario
    Created on : 30/04/2019, 09:40:45
    Author     : 80119050
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
                  Nome  : <input type="text" name="nome" required=""> <br><br>
                  Senha : <input type="password" name="senha" required=""> <br><br>
                  <input type="submit" value="Cadastrar"/>

              </form><br> 

             <form action="sairdosistema" method="post">
                <input type="submit" value = "sair">
             </form> 
           </fieldset>
         </div>
        
        
              
<%            
            Object obj1 = request.getAttribute("usuariocadastrado");
            Object obj2 = request.getAttribute("usuariovalidado");
            
            if(obj1 != null){
            
            Boolean usuariocadastrado = (Boolean) obj1;
            
                if(!usuariocadastrado){%>
                <hr>
                <input type="text" size="100" value="<% out.println("Não Foi possível cadastrar o novo Usuário. Tente novamente!");%>">
                <hr>
                <%}        
            }
               
            if(obj2 != null){
                Boolean usuariovalidado = (Boolean) obj2;
                if(!usuariovalidado){%>
                <br><br><br>
                <input type="text" size="100" value="<% out.println("Não foi possível validar "
                        + "o Usuário. Você precisa se cadastrar para acessar o sistema Avicena!");%>">
                
                <%}                
                
                }%>
        

        <div class="secao4">

        </div>
    
<footer class="footer">                
            &copy; Desenvolvido por Luciane Benetti e Marco Sena.
</footer>
        
</body>
</html>
