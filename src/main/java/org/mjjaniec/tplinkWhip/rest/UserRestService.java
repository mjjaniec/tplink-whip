package org.mjjaniec.tplinkWhip.rest;

import org.mjjaniec.tplinkWhip.model.User;
import org.mjjaniec.tplinkWhip.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mjjaniec on 19.12.14.
 */

@Path("/users")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService service = new UserService();
        return service.getDefaultUser();
    }
}
