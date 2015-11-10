/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1155997
 */
@ManagedBean
@ApplicationScoped
public class AdminBean extends PageBean{
    private ArrayList<Logins> logins;

    public AdminBean() {
        logins = new ArrayList<>();
    }

    public ArrayList<Logins> getLogins() {
        return logins;
    }

    public void setLogins(ArrayList<Logins> logins) {
        this.logins = logins;
    }
}
