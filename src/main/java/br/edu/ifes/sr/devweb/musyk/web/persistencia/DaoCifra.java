package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Cifra;

/**
 *
 * @author marcosdias
 */
public class DaoCifra extends Dao {

    public void save(Cifra cifra) {
        session.getTransaction().begin();
        session.save(cifra);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Cifra cifra) {
        this.session.update(cifra);
    }
    
    public void delete(Cifra cifra) {
        this.session.delete(cifra);
    }
    
    public Cifra findById(Long id) {
        return (Cifra)  this.session.get(Cifra.class, id);
    }
}
