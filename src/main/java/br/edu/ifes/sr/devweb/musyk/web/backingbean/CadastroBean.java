/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.backingbean;

import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Instrumento;
import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Perfil;
import br.edu.ifes.sr.devweb.musyk.web.model.cdp.Usuario;
import br.edu.ifes.sr.devweb.musyk.web.model.cgt.AplCadastro;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marcosdias
 */
@Getter
@Setter
@ManagedBean
@RequestScoped
public class CadastroBean extends AbstractBean{
    private AplCadastro aplCadastro = new AplCadastro();
    private Usuario usuario = new Usuario();
    private String confirmarSenha;
    private Set<Instrumento> instrumentos;
    
    @PostConstruct
    @Override
    public void init() {
        instrumentos = aplCadastro.principaisInstrumentos();
    }
    
    public String cadastrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(!usuario.getSenha().equals(this.confirmarSenha)){
            FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente!");
            context.addMessage(null,facesMessage);
            return null;
        }
        
        Perfil p = usuario.getPerfil();
        p.setUsuario(usuario);
        
        aplCadastro.cadastrarUsuario(usuario);
        return redirect.getIndex();
    }
}
