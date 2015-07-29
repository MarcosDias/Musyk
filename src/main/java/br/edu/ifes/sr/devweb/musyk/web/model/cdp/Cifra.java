/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.model.cdp;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
public class Cifra {
    private String musica;
    private String banda;
    private String tom;
    private String file;
    private boolean publica;
    private int nota;
    private Perfil dono;
    private Equipe equipe;
}
