/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Agendamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class AgendamentoDAO extends GenericoDAO<Agendamento> {
    private final EntityManager etm;
    public AgendamentoDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
        public List<Agendamento> buscarTodosAgendamentos(){
        Query q = etm.createNamedQuery("agendamento.buscarTodosAgendamento");
        return q.getResultList();
    }
    
    
}
