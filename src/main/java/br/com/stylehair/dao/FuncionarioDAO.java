/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class FuncionarioDAO extends GenericoDAO<Funcionario>{
    private final EntityManager etm;
    public FuncionarioDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
    public List<Funcionario> buscarTodosFuncionarios(){
        Query q = etm.createNamedQuery("funcionario.buscarTodosFuncionarios");
        return q.getResultList();
    }
    
}
