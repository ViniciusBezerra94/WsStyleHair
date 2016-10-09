/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name = "AGSE_SEQ", sequenceName = "AGSE_SEQ", initialValue = 1, allocationSize = 1)
public class AgendamentoServico implements Serializable, EntidadeBase{
    
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AGSE_SEQ")
        @Column(name="ID_AGEND_SERV")
        private Long id;
        
        @ManyToOne
        private Servico servico;
        
        @ManyToOne
        private Agendamento agendamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
        
        

        
    
}
