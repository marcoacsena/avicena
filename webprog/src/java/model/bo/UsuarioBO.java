
package model.bo;

import model.dao.UsuarioDAO;
import model.vo.UsuarioVO;


public class UsuarioBO {
    
     UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public int cadastrarUsuarioVO(UsuarioVO usuarioVO) {
        UsuarioVO usuario = usuarioDAO.pesquisarUsuarioVO(usuarioVO);
        int novoId = 0;
        
        if(usuario == null){            
           return novoId = usuarioDAO.inserir(usuarioVO);
            
        } else{return novoId; }         
    
        }        

    public UsuarioVO pesquisarUsuarioVO(UsuarioVO usuarioVO) {
        
        UsuarioVO usuario = usuarioDAO.pesquisarUsuarioVO(usuarioVO);
        if(usuario == null){
            return null;
            } else {return usuario;}
     }

       
}
