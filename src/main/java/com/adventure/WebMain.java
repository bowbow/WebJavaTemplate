package com.adventure;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A class that can be called on the web with params.
 * The url will look like this;
 * http://localhost:8080/guesser/a=3&b=0&guess=3
 * <p/>
 * It will return a true or false depending on whether the guess is right.
 */
@Path("/guesser")
public class WebMain {
    YourClass yc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String checkGuess(@PathParam("a") int a,
                             @PathParam("b") int b,
                             @PathParam("guess") int guess) {
        String response;
        yc = new YourClass();

        Boolean answer = yc.check(a, b, guess);
        if (answer) {
            response = "Great you answered correctly!";
        } else {
            response = "Sorry that was wrong.";
        }
        return response;
    }

}
