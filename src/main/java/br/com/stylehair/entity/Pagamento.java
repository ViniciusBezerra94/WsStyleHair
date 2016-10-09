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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name = "PAG_SEQ", sequenceName = "PAG_SEQ", initialValue = 1, allocationSize = 1)
public class Pagamento implements Serializable,EntidadeBase {
    
    @Id
    @Column(name = "ID_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PAG_SEQ")
    private Long id;
    private String status;
    private String tipo;
    
    @OneToOne
    private Agendamento agendamento;

    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
