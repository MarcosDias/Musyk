/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.devweb.musyk.web;

import br.edu.ifes.sr.devweb.musyk.web.conexao.HibernateUtil;

/**
 *
 * @author marcosdias
 */
public class Main {
    public static void main(String args[]){
        
        HibernateUtil.getSessionFactory();
        
    }
}
