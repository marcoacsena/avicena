
package model.bo;

import model.dao.UsuarioDAO;
import model.vo.UsuarioVO;


public class UsuarioBO {
    
     UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public int cadastrarUsuarioVO(UsuarioVO usuarioVO) {
        usuarioDAO.pesquisarUsuarioVO(usuarioVO);
        int novoId = usuarioVO.getCodigoUsuario();
        
        if(novoId == 0){            
           novoId = usuarioDAO.inserir(usuarioVO);
            
        } else{
            novoId=0;
    }
        
         return novoId;
    
        }        

    public UsuarioVO pesquisarUsuarioVO(UsuarioVO usuarioVO) {
        
        UsuarioVO usuario = usuarioDAO.pesquisarUsuarioVO(usuarioVO);
        if(usuario == null){
            return null;
            } else {return usuario;}
     }

       
}
