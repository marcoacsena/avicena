package Servlets;

import controller.PacienteController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.vo.PacienteVO;

public class PesquisarPacientePorCpf extends HttpServlet {

      PacienteVO pacienteVO = new PacienteVO();
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            pacienteVO.setCpfPaciente(request.getParameter("cpfpaciente"));            
                              
            PacienteController pacientecontroller = new PacienteController();
            pacienteVO = pacientecontroller.pesquisarPacienteVOPorCpf(pacienteVO.getCpfPaciente());
            
            if(pacienteVO != null){               
                
                request.setAttribute("codigopaciente", pacienteVO.getCodigoPaciente());
                request.setAttribute("nomepaciente", pacienteVO.getNomePaciente());
                request.setAttribute("celmenpaciente", pacienteVO.getCelMensagemPaciente());
                request.setAttribute("foneresidencial", pacienteVO.getFoneResidencial());
                request.setAttribute("fonecomercial", pacienteVO.getFoneComercial());
                request.setAttribute("email", pacienteVO.getEmailPaciente());                
                request.setAttribute("cpfpaciente", pacienteVO.getCpfPaciente());
                request.setAttribute("cnpjpaciente", pacienteVO.getCnpjPaciente());
                request.setAttribute("logradouro", pacienteVO.getLogradouro());
                request.setAttribute("numlogradouro", pacienteVO.getNumLogradouro());
                request.setAttribute("complemento", pacienteVO.getComplemento());
                request.setAttribute("bairro", pacienteVO.getBairro());
                request.setAttribute("cidade", pacienteVO.getCidade());
                request.setAttribute("uf", pacienteVO.getUf());
                request.setAttribute("cep", pacienteVO.getCep());
                
                System.out.println(pacienteVO);
                request.getRequestDispatcher("PesquisarPacientePorCpf.jsp").forward(request, response);
                
            }else {
                System.out.println("O paciente não foi encontrado!"); 
                Boolean resultadoDaPesquisaPorCpf = false;
                request.setAttribute("pacientevoretornado", resultadoDaPesquisaPorCpf);
                request.getRequestDispatcher("PesquisarPacientePorCpf.jsp").forward(request, response);    
                    }
        
        
    }


}
