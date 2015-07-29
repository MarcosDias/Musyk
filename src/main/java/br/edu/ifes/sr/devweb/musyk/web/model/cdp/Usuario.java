package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
@Entity
public class Usuario extends ObjetoPersistente{
    @Column
    @NotNull
    private String email;
    
    @Column
    @NotNull
    private String senha;
    
    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private Perfil perfil;
}
