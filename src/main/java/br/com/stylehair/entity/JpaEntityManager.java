/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vinicius
 */
public class JpaEntityManager {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("StyleHairPU");
    private EntityManager em =  factory.createEntityManager();
    
    public EntityManager getEM(){
        return em;
    }
}
