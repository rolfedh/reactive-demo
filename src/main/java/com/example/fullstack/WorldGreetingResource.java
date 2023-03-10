package com.example.fullstack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/world")
public class WorldGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() { return "Hello worlds";}
}