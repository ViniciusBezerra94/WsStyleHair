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
import javax.persistence.Id;
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
    @GeneratedValue
    @Column(name="ID_TELEFONE")
    private Long id;
    private int numero;
    
    @ManyToOne
    private Cliente cliente;
    
    
    
    
    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
