<%-- 
    Document   : ConsultarPacientePorCpf
    Created on : 01/04/2019, 08:13:17
    Author     : 80119050
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CRUD.css">
        <title>Pesquisa de Pacientes por CPF</title>
    </head>
    <body class="body">
               
        <div id="consultaCPF">
            <h2>Pesquisar Paciente por CPF!</h2>
            
            <form method="post" action="pesquisarpacienteporcpf">

                <fieldset><legend>Digite o CPF do Paciente a ser consultado na base de dados</legend>
                    <p><a>*</a>Campos de preenchimento obrigatório</p>                    
                    
                    CPF<a>*</a>: 
                    <input type="text" name="cpfpaciente" required><br><br>
                               
                    <input type="submit" value = "Pesquisar Paciente">                

                </fieldset>
            </form>
            <br><br>  
            
        </div>
        
        <div id="resultadoCPF">
            <h2>Resultado da pesquisa de Paciente por CPF:</h2>
            
            <%            
                Object obj = request.getAttribute("pacientevoretornado");
            
            if(obj != null){
              Boolean PacienteVORetornado = (Boolean) obj;       
                        
                if(!PacienteVORetornado){%>                     
                <input type="text" size="100" style="margin-left: 5px;" value="<% out.println("Paciente não encontrado!"
                        + " Tente novamente. Se o Paciente não for cadastrado, por gentileza, cadastrá-lo!!");%>">               
                <%} else{%>

                    <form action="atualizarpaciente" method="post">

                    <fieldset><legend>Dados do Paciente</legend>
                                                
                        Nome: <input type="text" name="nomepaciente" value="<%= request.getAttribute("nomepaciente")%>"><br><br>            
                        Celular: <input type="text" name="celularpaciente" required size="10"> Fone Residencial: <input type="text" name="foneresidencial" size="10"> Fone Comercial: <input type="text" name="fonecomercial" size="10"><br><br>
                        e-mail: <input type="email" name="email" size="80"><br><br>
                        CPF: <input type="text" name="cpfpaciente" required> CNPJ: <input type="text" name="cnpjpaciente"><br><br>
                        Rua: <input type="text" name="logradouro" required size="80"> Num: <input type="text" name="numlogradouro" required size="3"><br><br>
                        Complemento: <input type="text" name="complemento" size="80"><br><br>
                        Bairro<input type="text" name="bairro" required> Cidade: <input type="text" name="cidade" required> UF: <input type="text" name="uf" required><br><br>
                        CEP: <input type="text" name="cep"> 
                            <br><br> 
                        <input type="submit" value="Atualizar Dados do Paciente">
                    </fieldset>
                </form><br><br>
                    <%}                
            }%>    
            
                
            <form action="Idex.jsp" method="POST">
                <input type="submit" value="Retornar para a Página Principal do sistema Avicena"><br><br>
            </form>            
            
        </div>

        <footer class="footer">                
            &copy; Desenvolvido por Luciane Benetti e Marco Sena.
        </footer>
        
    </body>
</html>
