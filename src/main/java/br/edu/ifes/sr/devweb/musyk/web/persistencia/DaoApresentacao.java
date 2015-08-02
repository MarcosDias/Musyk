package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Apresentacao;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Setter
public class DaoApresentacao extends Dao{

    public void save(Apresentacao apresentacao) {
        session.getTransaction().begin();
        session.save(apresentacao);
        session.getTransaction().commit();
        session.close();
    }
    
    public void update(Apresentacao apresentacao) {
        this.session.update(apresentacao);
    }
    
    public void delete(Apresentacao apresentacao) {
        this.session.delete(apresentacao);
    }
    
    public Apresentacao findById(Long id) {
        return (Apresentacao)  this.session.get(Apresentacao.class, id);
    }
}
