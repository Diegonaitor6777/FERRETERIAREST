/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restferreteria.rest;

import com.restferreteria.consultaDB.ConsultasDB;
import com.restferreteria.entidad.FormaPago;
import com.restferreteria.entidad.Producto;
import com.restferreteria.entidad.Proveedores;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Diego
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.restferreteria.rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("producto")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public List<Producto> getJson() {
         ConsultasDB con = new ConsultasDB();
        return con.Productoinvet();
    }    
    @GET
    @Path("formapago")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public List<FormaPago> getFormaPago() {
        ConsultasDB con = new ConsultasDB();
        return con.listapago();   
    }
    @GET
    @Path("Productoinventario")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public List<Producto> Productoinventario() {
        ConsultasDB con = new ConsultasDB();
        return con.Productoinvet();
    }
    @GET
    @Path("listaproveedor")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public List<Proveedores> Listaproveedor() {
        ConsultasDB con = new ConsultasDB();
        return con.listadoproveddor();
    }
    
    @POST
    @Path("login")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String login(@QueryParam("username") String usuario , @QueryParam("password") String password) {
        ConsultasDB con = new ConsultasDB();
        return con.Consultausuario(usuario, password);
    }
    
    
}
