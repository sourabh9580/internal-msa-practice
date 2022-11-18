package com.external.external_exam.service;

import Entity.Category;
import Entity.Garments;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleService {
    
    @Inject garmentsbean gb;

    @GET
    public Response get() {
        return Response.ok("Hello, world!").build();
    }
    
    @RolesAllowed("CUSTOMER")
    @GET
    @Path("getallgarments")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Garments> getallgarments(){
        return gb.getallgarments();
    }
    
    @RolesAllowed("CUSTOMER")
    @GET
    @Path("getbycategory?category={id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Garments> getgarmentsbycategory(@PathParam("id")Integer categoryid){
        return gb.getgarmentsbycategory(categoryid);
    }
    
    @RolesAllowed("CUSTOMER")
    @GET
    @Path("getallcategories")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Category> getallcategories(){
        return gb.getallcategories();
    }

}
