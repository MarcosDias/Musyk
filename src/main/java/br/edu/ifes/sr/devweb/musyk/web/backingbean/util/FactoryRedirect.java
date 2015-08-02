/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.backingbean.util;

import lombok.Getter;

/**
 *
 * @author marcosdias
 */
@Getter
public class FactoryRedirect {
    private final String index = "index";
    private final String cadastro = "cadastro";
    private final String principal = "principal";
    private final String logoff = index;
    private final String perfil = "perfil/index";
}
