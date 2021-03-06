/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */

@NamedQueries({
    @NamedQuery(name = "funcionario.buscarTodosFuncionarios", query = "select f from Funcionario f")
})



@Entity
@SequenceGenerator(name = "FUN_SEQ", sequenceName = "FUN_SEQ", initialValue = 1, allocationSize = 1)
public class Funcionario implements Serializable,EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "FUN_SEQ")
    @Column(name="ID_FUNCIONARIO")
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String camFoto;

    
     @OneToMany(mappedBy="func",cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCamFoto() {
        return camFoto;
    }

    public void setCamFoto(String camFoto) {
        this.camFoto = camFoto;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    
    
}
