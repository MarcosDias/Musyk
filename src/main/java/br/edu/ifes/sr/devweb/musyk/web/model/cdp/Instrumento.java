/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import br.edu.ifes.sr.devweb.musyk.web.model.util.persistencia.ObjetoPersistente;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Instrumento extends ObjetoPersistente{
    @Column(unique = true)
    @NotNull
    private String nome;
}
