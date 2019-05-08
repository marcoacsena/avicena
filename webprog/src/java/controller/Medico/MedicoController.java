
package controller.Medico;

import java.util.ArrayList;
import model.bo.Medico.MedicoBO;
import model.vo.Medico.MedicoVO;

public class MedicoController {

    MedicoBO medicoBO = new MedicoBO();
    public ArrayList<MedicoVO> listarTodosOsMedicosVO() {
         return medicoBO.ListarTodosOsMedicoVO();
    }
    
}
