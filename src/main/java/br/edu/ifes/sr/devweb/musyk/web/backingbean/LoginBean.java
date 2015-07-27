/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.backingbean;

import br.edu.ifes.sr.devweb.musyk.web.model.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@ManagedBean()
@SessionScoped
@Getter
@Setter
public class LoginBean extends AbstractBean{
    private Usuario usuario;
    
    public String entrar(){
        System.out.println("Usuário Logando");
        
        return this.redirect.getPrincipal();
    }
}
