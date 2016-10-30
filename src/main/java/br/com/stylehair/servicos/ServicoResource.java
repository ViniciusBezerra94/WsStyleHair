/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.servicos;

import br.com.stylehair.dao.ServicoDAO;
import br.com.stylehair.entity.Servico;
import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author vinicius
 */
@Stateless
@Path("servico")
public class ServicoResource {
    @PersistenceContext(unitName = "StyleHairPU")
    private EntityManager em;
    
    
    private Gson gson = new Gson();
    
    @Context
    private UriInfo context;
    
    
    @GET
    @Produces("application/json")
    public String getJson() {
        ServicoDAO dao = new ServicoDAO(em);
         List<Servico> servicos;
        servicos = dao.buscarTodosServicos();
       
      
        return gson.toJson(servicos);
    }
}
