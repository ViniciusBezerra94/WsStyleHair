/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.servicos;

import br.com.stylehair.dao.TelefoneDAO;
import br.com.stylehair.entity.Telefone;
import com.google.gson.Gson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("telefone")
public class TelefoneResource {
        @PersistenceContext(unitName = "StyleHairPU")
    private EntityManager em;
    
    
    private Gson gson = new Gson();
    
    @Context
    private UriInfo context;
    
    @POST   
    @Consumes("application/json")
    @Produces("application/json")
    public String salvarTelefone(String telefone) throws Exception{
        
            Telefone t1 = gson.fromJson(telefone, Telefone.class);
            TelefoneDAO dao = new TelefoneDAO(em);
            return gson.toJson(dao.salvar(t1));
        
    }
    
     @GET
    @Path("{telefoneId}")
    @Produces("application/json")
    public String getTelefone(@PathParam("telefoneId") String id){
        System.out.println("pegando o cliente");
        Long n = Long.parseLong(id);
        System.out.println(n);
        TelefoneDAO dao = new TelefoneDAO(em);
        Telefone c = dao.consultarPorId(Telefone.class, Long.parseLong(id));
   
        return gson.toJson(c);
       
    }
}
