package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Path("/hello")
public class GreetingResource {
    private Logger logger = LogManager.getLogger(GreetingResource.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}