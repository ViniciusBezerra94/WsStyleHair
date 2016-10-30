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
    @NamedQuery(name = "servico.buscarTodosServicos", query = "select s from Servico s")
   
})



@Entity
@SequenceGenerator(name = "SER_SEQ",sequenceName = "SER_SEQ",allocationSize = 1,initialValue = 1)
public class Servico implements Serializable,EntidadeBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SER_SEQ")
    @Column(name="ID_SERVICO")
    private Long id;
    private String descricao;
    private double valor;
    
    
    @Column(name="TEMPO_DURACAO")
    @Temporal(TemporalType.TIME)
    private Date tempoDuracao;
    
    private String camFoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(Date tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getCamFoto() {
        return camFoto;
    }

    public void setCamFoto(String camFoto) {
        this.camFoto = camFoto;
    }
    
    
    
}
