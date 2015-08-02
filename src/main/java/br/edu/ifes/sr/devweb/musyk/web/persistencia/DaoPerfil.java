/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Perfil;

/**
 *
 * @author marcosdias
 */
public class DaoPerfil extends Dao {

    public void save(Perfil perfil) {
        session.getTransaction().begin();
        session.save(perfil);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Perfil perfil) {
        this.session.update(perfil);
    }
    
    public void delete(Perfil perfil) {
        this.session.delete(perfil);
    }
    
    public Perfil findById(Long id) {
        return (Perfil)  this.session.get(Perfil.class, id);
    }
    
}
