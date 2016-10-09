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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

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
    
   
    public ClienteResource() {
    }

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
    
    @GET
    @Path("{clienteId}")
    @Produces("application/json")
    public String getCliente(@PathParam("clienteId") String id){
        Long n = Long.parseLong(id);
        System.out.println(n);
        ClienteDAO dao = new ClienteDAO(em);
        Cliente c = dao.consultarPorId(Cliente.class, Long.parseLong(id));
   
        return gson.toJson(c);
       
    }

    /**
     * PUT method for updating or creating an instance of ClienteResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes("application/json")
    public void atualizarCliente(String cliente) {
        salvarCliente(cliente);
    }
    
    
    @POST
    @Consumes("application/json")
    public void salvarCliente(String cliente){
        try{
            Cliente c = gson.fromJson(cliente, Cliente.class);
            ClienteDAO dao = new ClienteDAO(em);
            dao.salvar(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
