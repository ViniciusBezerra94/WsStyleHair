/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Telefone;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class TelefoneDAO extends GenericoDAO<Telefone> {
    private final EntityManager etm;
    public TelefoneDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
}
