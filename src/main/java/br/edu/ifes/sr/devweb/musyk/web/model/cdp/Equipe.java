package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
public class Equipe extends ObjetoPersistente{
    
    @Column
    @NotNull
    private String nome;
    
    /*@Column
    @NotNull
    private List<String> fotos;*/
    
    @Column
    private String fotoPerfil;
    
    @OneToMany
    private List<Apresentacao> apresentacoes;
    
    @OneToMany
    private List<Cifra> cifras;
    
    @ManyToMany
    private List<Perfil> usuarios;
}
