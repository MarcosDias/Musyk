/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.backingbean;

import br.edu.ifes.sr.devweb.musyk.web.backingbean.util.FactoryRedirect;
import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
public abstract class AbstractBean {
    protected FactoryRedirect redirect;
    
    @PostConstruct
    public void init() {
        this.redirect = new FactoryRedirect();
    }
    
    public String logoff(){
        System.out.println("Realizado logoff");
        return this.redirect.getLogoff();
    }    
}
