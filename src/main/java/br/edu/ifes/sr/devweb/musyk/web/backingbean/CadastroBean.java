/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.backingbean;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Instrumento;
import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Perfil;
import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
@ManagedBean()
@RequestScoped
public class UsuarioBean extends AbstractBean{
    private Usuario usuario;
    private String confirmarSenha;
    private Perfil perfil;
    private List<Instrumento> instrumentos;
    
    //TODO - Remover metodo apos realizar a interacao com o BD
    @PostConstruct
    public void init() {
        instrumentos = new ArrayList<>();
        this.instrumentos.add(new Instrumento("Violão"));
        this.instrumentos.add(new Instrumento("Guitarra"));
        this.instrumentos.add(new Instrumento("Baixo"));
        this.instrumentos.add(new Instrumento("Bateria"));
        this.instrumentos.add(new Instrumento("Teclado"));
        this.instrumentos.add(new Instrumento("Cavaquinho"));
        this.instrumentos.add(new Instrumento("Viola"));
        this.instrumentos.add(new Instrumento("Ukulele"));
        this.instrumentos.add(new Instrumento("Gaita"));
        this.instrumentos.add(new Instrumento("Voz"));
    }
    
    public String cadastrar(){
        System.out.println("Usuário criado");
        
        return redirect.getPrincipal();
    }
}
