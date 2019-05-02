
package controller;

import model.bo.UsuarioBO;
import model.vo.UsuarioVO;


public class UsuarioController {

    UsuarioBO usuarioBO = new UsuarioBO();

    public int cadastrarUsuarioVO(UsuarioVO usuarioVO) {
        
        return usuarioBO.cadastrarUsuarioVO(usuarioVO);
    }

    public UsuarioVO pesquisarUsuarioVO(UsuarioVO usuarioVO) {
        
//        System.out.println("O nome é: " + usuarioVO.getLogin());
//        System.out.println("a senha é: " + usuarioVO.getSenha());
    
            UsuarioVO usuario = usuarioBO.pesquisarUsuarioVO(usuarioVO);
        return usuario;
    }

}
