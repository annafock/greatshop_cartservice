package com.cart;

import java.util.Date;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * JAX-RS application. Root path is /webshop
 *
 */

@ApplicationPath("/cart")
@Path("")

public class CartServiceApp extends Application
{
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectory(@Context UriInfo uri) {
        Link selfLink = Link.fromUri(uri.getBaseUri())
                .rel("self").type(MediaType.APPLICATION_JSON)
                .build();
        Link productsLink = Link.fromUri(uri.getBaseUri() + "cart")
                .rel("cart").type(MediaType.APPLICATION_JSON)
                .build();

        return Response.ok()
                .lastModified(new Date())
                .location(uri.getRequestUri())
                .links(selfLink, productsLink)
                .build();
    }
	
	//public static void main(String[] args) {}
}
