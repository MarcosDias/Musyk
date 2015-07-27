package br.edu.ifes.sr.devweb.musyk.web.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
public class Usuario {
    private String email;
    private String senha;
    private Perfil perfil;
}
