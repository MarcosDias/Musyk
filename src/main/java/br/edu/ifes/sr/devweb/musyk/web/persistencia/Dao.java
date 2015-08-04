/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web.persistencia;

import br.edu.ifes.sr.devweb.musyk.web.conexao.HibernateUtil;
import lombok.Setter;
import org.hibernate.Session;

/**
 *
 * @author marcosdias
 */
@Setter
public abstract class Dao{
    protected Session session;
}
