/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Instrumento;
import java.util.List;
import org.hibernate.Query;

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
        session.getTransaction().begin();
        this.session.update(instrumento);
        session.getTransaction().commit();
        session.close();
    }
    
    public void delete(Instrumento instrumento) {
        session.getTransaction().begin();
        this.session.delete(instrumento);
        session.getTransaction().commit();
        session.close();
    }
    
    public Instrumento findById(Long id) {
        session.getTransaction().begin();
        Instrumento inst = (Instrumento)  this.session.get(Instrumento.class, id);
        session.getTransaction().commit();
        session.close();
        return inst;
    }
    
    public List<Instrumento> fyndByAll() {
        session.getTransaction().begin();
        List<Instrumento> listInst = this.session.createCriteria(Instrumento.class).list();
        session.getTransaction().commit();
        session.close();
        return listInst;
    }
    
    public Instrumento findByNomeOrSave(String nome){
        session.getTransaction().begin();
        String hql="select i from Instrumento i where i.nome = :nome";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("nome", nome);
        Instrumento inst = (Instrumento) consulta.uniqueResult();
        if(inst == null){
            inst = new Instrumento(nome);
            this.save(inst);
        }
        session.getTransaction().commit();
        session.close();
        return inst;
    }
}
