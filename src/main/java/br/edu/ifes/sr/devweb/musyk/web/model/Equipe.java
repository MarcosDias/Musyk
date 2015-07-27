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
public class Equipe {
    private String nome;
    private List<String> fotos;
    private String fotoPerfil;
    private List<Apresentacao> apresentacoes;
    private List<Cifra> cifras;
    private List<Perfil> usuarios;
}
