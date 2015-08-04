package br.edu.ifes.sr.devweb.musyk.web.model.cgt;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Instrumento;
import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Usuario;
import br.edu.ifes.sr.devweb.musyk.web.persistencia.DaoFactory;
import br.edu.ifes.sr.devweb.musyk.web.persistencia.DaoInstrumento;
import br.edu.ifes.sr.devweb.musyk.web.persistencia.DaoUsuario;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author marcosdias
 */
public class AplCadastro {
    private final DaoUsuario daoUsuario = new DaoUsuario();
    private final DaoInstrumento daoInstrumento = DaoFactory.criarDaoInstrumeto();

    public void cadastrarUsuario(Usuario usuario) {
        daoUsuario.save(usuario);
    }
    
    public void apagarUsuario(Usuario usuario){
        daoUsuario.delete(usuario);
    }
    
    public List<Instrumento> allInstrumentos(){
        return daoInstrumento.fyndByAll();
    }
    
    public Set<Instrumento> principaisInstrumentos() {
        LinkedHashSet<Instrumento> instrumentos = new LinkedHashSet();
        instrumentos.add(daoInstrumento.findByNomeOrSave("Baixo"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Bateria"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Cavaquinho"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Gaita"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Guitarra"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Viola"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Violão"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Teclado"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Ukulele"));
        instrumentos.add(daoInstrumento.findByNomeOrSave("Voz"));
        
        return instrumentos;
    }
}
