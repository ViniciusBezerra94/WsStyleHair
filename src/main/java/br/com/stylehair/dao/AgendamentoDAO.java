/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Agendamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
    public List<Agendamento> buscarAgendamentoPorData(String data, String hora) {
        System.out.println(data);
        Query q = etm.createNamedQuery("agendamento.buscarAgendametoPorData");
        String aux = "23:59";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data2 = null;
        Date data3 = null;
        try {
            data2 = sdf.parse(data+hora);
            data3 = sdf.parse(data+aux);
        } catch (ParseException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        q.setParameter("dataHora1", data2);
        q.setParameter("dataHora2", data3);
        return q.getResultList();
    }
    
    
}
