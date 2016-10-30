/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Servico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class ServicoDAO extends GenericoDAO<Servico> {
    private final EntityManager etm;
    public ServicoDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
        public List<Servico> buscarTodosServicos(){
        Query q = etm.createNamedQuery("servico.buscarTodosServicos");
        return q.getResultList();
    }
    
}
