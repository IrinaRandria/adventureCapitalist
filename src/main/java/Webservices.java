/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irandria
 */
@Path("generic") //ecrire quoi
public class Webservices {
    Services services;
    
    public Webservice(){
        services =new Services();
    }
    
    @GET //quel import 
    @Path("world")
    @Produces(MediaType.APPLICATION_XML)
    public Response getWorld(){
        return Response.ok(services.getWorld()).build();
    }
}
    

