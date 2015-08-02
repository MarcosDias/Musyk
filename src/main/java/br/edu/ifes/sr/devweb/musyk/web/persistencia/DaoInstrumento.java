/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Instrumento;

/**
 *
 * @author marcosdias
 */
public class DaoInstrumento extends Dao {

    public void save(Instrumento instrumento) {
        session.getTransaction().begin();
        session.save(instrumento);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Instrumento instrumento) {
        this.session.update(instrumento);
    }
    
    public void delete(Instrumento instrumento) {
        this.session.delete(instrumento);
    }
    
    public Instrumento findById(Long id) {
        return (Instrumento)  this.session.get(Instrumento.class, id);
    }
}
