package br.edu.ifes.sr.devweb.musyk.web.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
public class Perfil {
    private String nome;
    private String telefone;
    private String fotoPerfil;
    private Usuario usuario;
    private List<Instrumento> instrumentos;
    private List<Equipe> equipes;
    private List<Cifra> cifras;
}
