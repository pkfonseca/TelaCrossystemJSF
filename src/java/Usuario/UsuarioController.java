/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import javax.faces.bean.ViewScoped;

/**
 *
 * @author cross
 */
@ViewScoped
@javax.faces.bean.ManagedBean(name = "usuarioController")

public class UsuarioController {

    Usuario usuario = new Usuario();


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
