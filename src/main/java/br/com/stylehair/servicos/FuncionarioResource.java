/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.servicos;

import br.com.stylehair.dao.FuncionarioDAO;
import br.com.stylehair.entity.Funcionario;
import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author vinicius
 */
@Stateless
@Path("funcionario")
public class FuncionarioResource {
    
    @PersistenceContext(unitName = "StyleHairPU")
    private EntityManager em;
    
    
    private Gson gson = new Gson();
    
    @Context
    private UriInfo context;
    
    
    @GET
    @Produces("application/json")
    public String getJson() {
        FuncionarioDAO dao = new FuncionarioDAO(em);
         List<Funcionario> funcs;
        funcs = dao.buscarTodosFuncionarios();
       
      
        return gson.toJson(funcs);
    }
    
        @GET
    @Path("{funcionarioId}")
    @Produces("application/json")
    public String getCliente(@PathParam("funcionarioId") String id){
        System.out.println("pegando o cliente");
        Long n = Long.parseLong(id);
        System.out.println(n);
        FuncionarioDAO dao = new FuncionarioDAO(em);
        Funcionario f = dao.consultarPorId(Funcionario.class, Long.parseLong(id));
   
        return gson.toJson(f);
       
    }
    
}
