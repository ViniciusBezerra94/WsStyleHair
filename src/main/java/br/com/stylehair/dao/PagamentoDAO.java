/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Pagamento;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class PagamentoDAO extends GenericoDAO<Pagamento> {
    private final EntityManager etm;
    public PagamentoDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
}
