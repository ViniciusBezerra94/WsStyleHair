/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class ClienteDAO extends GenericoDAO<Cliente>{
    private final EntityManager etm;
    public ClienteDAO (EntityManager em){
        super(em);
        etm = em;
    }
     
    
    public List<Cliente> buscarTodosCliente(){
        Query q = etm.createNamedQuery("cliente.buscarTodosCliente");
        return q.getResultList();
    }
    
    
    public String buscarProximoId(){
        Query q = etm.createNativeQuery("select CLI_SEQ.NEXTVAL FROM DUAL");
        return String.valueOf(q.getSingleResult());
    }
}
