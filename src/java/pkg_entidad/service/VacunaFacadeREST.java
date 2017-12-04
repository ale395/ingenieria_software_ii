/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_entidad.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pkg_entidad.Vacuna;

/**
 *
 * @author Hiro
 */
@Stateless
@Path("pkg_entidad.vacuna")
public class VacunaFacadeREST extends AbstractFacade<Vacuna> {

    @PersistenceContext(unitName = "control_vacunas_web_servicePU")
    private EntityManager em;

    public VacunaFacadeREST() {
        super(Vacuna.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Vacuna entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Vacuna entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Vacuna find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("/hijo/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Vacuna> find_vacunas(@PathParam("id") Integer id) {
        return super.find_vacunas(id);
    }
    

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<Vacuna> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Vacuna> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }   
}