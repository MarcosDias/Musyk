package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Usuario extends ObjetoPersistente{
    @Column(unique = true)
    @NotNull
    private String email;
    
    @Column
    @NotNull
    private String senha;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="perfil_id", unique=true)
    @NotNull
    private Perfil perfil = new Perfil();
}
