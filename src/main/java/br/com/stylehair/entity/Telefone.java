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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name = "TEL_SEQ", sequenceName = "TEL_SEQ", initialValue = 1 , allocationSize = 1)
public class Telefone implements Serializable,EntidadeBase{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEL_SEQ")
    @Column(name="ID_TELEFONE")
    private Long id;
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    

    
}
