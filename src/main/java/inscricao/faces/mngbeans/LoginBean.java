/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1155997
 */

@ManagedBean
@RequestScoped
public class LoginBean extends PageBean{
    private String usuario;
    private String senha;
    private Boolean Administrador;

    public LoginBean() {
        Administrador = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(Boolean Administrador) {
        this.Administrador = Administrador;
    }
    
    public String confirmaAction() {
        if(usuario.equals(senha)){
            
            if(Administrador){
                Logins l =new Logins();
                l.setData(new Date());
                l.setNome(usuario);
                
                AdminBean bean = (AdminBean) getBean("adminBean");
                bean.getLogins().add(l);
                
                return "admin.html";
            }
        }
        
        return "cadastro.xhtml";
    }
}
