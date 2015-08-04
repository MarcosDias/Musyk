package br.edu.ifes.sr.devweb.musyk.web.persistencia;


import br.edu.ifes.sr.devweb.musyk.web.conexao.HibernateUtil;
import lombok.NoArgsConstructor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcosdias
 */
@NoArgsConstructor
public class DaoFactory {
   public static DaoInstrumento criarDaoInstrumeto(){
       DaoInstrumento dao = new DaoInstrumento();
       dao.setSession(HibernateUtil.getSessionFactory().openSession());
       return dao;
   }
}
