package Servlets;

import controller.PacienteController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.vo.PacienteVO;

public class AtualizarPaciente extends HttpServlet {

PacienteVO pacienteVO = new PacienteVO();
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        
        pacienteVO.setNomePaciente(request.getParameter("nomepaciente"));
        pacienteVO.setCelMensagemPaciente(request.getParameter("celmenpaciente"));
        pacienteVO.setFoneResidencial(request.getParameter("foneresidencial")); 
        pacienteVO.setFoneComercial(request.getParameter("fonecomercial"));
        pacienteVO.setEmailPaciente(request.getParameter("email"));
        pacienteVO.setCpfPaciente(request.getParameter("cpfpaciente"));
        pacienteVO.setCnpjPaciente(request.getParameter("cnpjpaciente"));
        pacienteVO.setLogradouro(request.getParameter("logradouro"));
        pacienteVO.setNumLogradouro(request.getParameter("numlogradouro"));
        pacienteVO.setBairro(request.getParameter("bairro")); 
        pacienteVO.setCidade(request.getParameter("cidade"));
        pacienteVO.setCep(request.getParameter("uf"));
        pacienteVO.setUf(request.getParameter("cep"));
                                      
            PacienteController pacientecontroller = new PacienteController();
            boolean atualizado = pacientecontroller.atualizarPacienteVO(pacienteVO);
            
            if(atualizado){
                
                String resultadoDaAtualizacao = "Dados do Paciente atualizados!";
                request.setAttribute("atualizacao", resultadoDaAtualizacao);
            }else {String resultadoDaAtualizacao = "Não foi possível atualizar os dados do Paciente!"; 
                request.setAttribute("atualizacao", resultadoDaAtualizacao);}
             
                request.getRequestDispatcher("PesquisarPacientePorCpf.jsp").forward(request, response);
           
    }      
}
