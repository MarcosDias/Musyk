package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
public class Perfil extends ObjetoPersistente{
    @Column
    @NotNull
    private String nome;
    
    @Column
    @NotNull
    private String telefone;
    
    @Column
    @NotNull
    private String fotoPerfil;
    
    @OneToOne(mappedBy = "perfil")
    @NotNull
    private Usuario usuario;
    
    @ManyToMany
    private List<Instrumento> instrumentos;
    
    @ManyToMany
    private List<Equipe> equipes;
    
    @OneToMany
    private List<Cifra> cifras;
}