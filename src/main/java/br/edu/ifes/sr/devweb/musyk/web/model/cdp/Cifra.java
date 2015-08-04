/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
public class Cifra extends ObjetoPersistente{
    @Column
    @NotNull
    private String musica;
    
    @Column
    @NotNull
    private String banda;
    
    @Column
    @NotNull
    private String tom;
    
    @Column
    private String file;
    
    @Column
    @NotNull
    private boolean publica;
    
    @Column
    private int nota;
    
    @NotNull
    @ManyToOne
    private Perfil dono;
    
    @OneToOne
    private Equipe equipe;
}
