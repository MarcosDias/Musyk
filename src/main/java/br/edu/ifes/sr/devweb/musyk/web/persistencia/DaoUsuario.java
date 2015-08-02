/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Usuario;

/**
 *
 * @author marcosdias
 */
public class DaoUsuario extends Dao {

    public void save(Usuario usuario) {
        session.getTransaction().begin();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Usuario usuario) {
        this.session.update(usuario);
    }
    
    public void delete(Usuario usuario) {
        this.session.delete(usuario);
    }
    
    public Usuario findById(Long id) {
        return (Usuario)  this.session.get(Usuario.class, id);
    }
}
