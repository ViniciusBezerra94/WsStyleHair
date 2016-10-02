/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.dao;

import br.com.stylehair.entity.EntidadeBase;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class GenericoDAO<T extends EntidadeBase> {

    private EntityManager em;
    public GenericoDAO(EntityManager em)
    {
        this.em = em;
    }

    public T salvar(T t) throws Exception {

        



            if (t.getId() == null) {
                em.persist(t);
            } else {
                if (!em.contains(t)) {
                    if (em.find(t.getClass(), t.getId()) == null) {
                        throw new Exception("Erro ao atualizar");
                    }
                }
                t = em.merge(t);
            }
            



        return t;
    }

    public void remover(Class<T> classe, Long id) {
        
        T t = em.find(classe, id);

            em.remove(t);
       

    }

    public T consultarPorId(Class<T> classe, Long id) {
        
        

        return em.find(classe, id); //Consultar por ID

    }
}
