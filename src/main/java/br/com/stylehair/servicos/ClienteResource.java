/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stylehair.servicos;

import br.com.stylehair.dao.ClienteDAO;
import br.com.stylehair.entity.Cliente;

import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author vinicius
 */
@Stateless
@Path("cliente")
public class ClienteResource {

    @PersistenceContext(unitName = "StyleHairPU")
    private EntityManager em;
    
    
    private Gson gson = new Gson();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ClienteResource
     */
    
   


    /**
     * Retrieves representation of an instance of br.com.stylehair.servicos.ClienteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        ClienteDAO dao = new ClienteDAO(em);
         List<Cliente> clientes;
        clientes = dao.buscarTodosCliente();
       
      
        return gson.toJson(clientes);
    }
    
    /**
     *
     * @param id
     * @return
     */
    @GET
    @Path("{clienteId}")
    @Produces("application/json")
    public String getCliente(@PathParam("clienteId") String id){
        System.out.println("pegando o cliente");
        Long n = Long.parseLong(id);
        System.out.println(n);
        ClienteDAO dao = new ClienteDAO(em);
        Cliente c = dao.consultarPorId(Cliente.class, Long.parseLong(id));
   
        return gson.toJson(c);
       
    }
    
    
    @POST   
    @Consumes("application/json")
    public void salvarCliente(String cliente) throws Exception{
        
            Cliente c1 = gson.fromJson(cliente, Cliente.class);
            ClienteDAO dao = new ClienteDAO(em);
            dao.salvar(c1);
        
    }

    /**
     * PUT method for updating or creating an instance of ClienteResource
     * @param cliente
     */
    @PUT
    @Consumes("application/json")
    public void atualizarCliente(String cliente) throws Exception {
        salvarCliente(cliente);
    }
    

    

    
    /**
     *
     * @param id
     */
    @DELETE
    @Path("{id}")
    public void removerCliente(@PathParam("id") String id){
        ClienteDAO dao = new ClienteDAO(em);
        dao.remover(Cliente.class, Long.valueOf(id));
    }
    
}
