package model.bo.Medico;

import java.util.ArrayList;
import model.dao.Medico.MedicoDAO;
import model.vo.Medico.MedicoVO;

public class MedicoBO {

    MedicoDAO medicoDAO = new MedicoDAO();
    
    public ArrayList<MedicoVO> ListarTodosOsMedicoVO() {
        
         return medicoDAO.listarTodosOsMedicos();
    }
    
}
