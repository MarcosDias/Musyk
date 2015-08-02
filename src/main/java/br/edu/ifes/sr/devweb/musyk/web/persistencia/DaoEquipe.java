/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Equipe;

/**
 *
 * @author marcosdias
 */
public class DaoEquipe extends Dao {

    public void save(Equipe equipe) {
        session.getTransaction().begin();
        session.save(equipe);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Equipe equipe) {
        this.session.update(equipe);
    }
    
    public void delete(Equipe equipe) {
        this.session.delete(equipe);
    }
    
    public Equipe findById(Long id) {
        return (Equipe)  this.session.get(Equipe.class, id);
    }
}
