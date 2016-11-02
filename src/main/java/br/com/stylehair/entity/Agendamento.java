/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinicius
 */
@NamedQueries({
    @NamedQuery(name = "agendamento.buscarTodosAgendamento", query = "select a from Agendamento a"),
    @NamedQuery(name = "agendamento.buscarAgendametoPorData", query = "select a from Agendamento a where a.dataHoraIni between :dataHora1 and :dataHora2 and a.horaMarcada like 'n'" )
    
   
})


@Entity
@SequenceGenerator(name = "AGE_SEQ", sequenceName = "AGE_SEQ", initialValue = 1, allocationSize = 1)
public class Agendamento implements Serializable,EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "AGE_SEQ")
    @Column(name = "ID_AGEND")
    private Long id;
    
    @Column(name = "VALOR_TOTAL")
    private double valorTotal;
    
    @Column(name = "DATA_HORA_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraIni;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA_FIM")
    private Date dataHoraFim;
    
    
    private char horaMarcada;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario func;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataHoraIni() {
        return dataHoraIni;
    }

    public void setDataHoraIni(Date dataHoraIni) {
        this.dataHoraIni = dataHoraIni;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public char getHoraMarcada() {
        return horaMarcada;
    }

    public void setHoraMarcada(char horaMarcada) {
        this.horaMarcada = horaMarcada;
    }
    
    
    
    
}
