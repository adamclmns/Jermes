/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adamclmns.jermese.endpoint;

import com.adamclmns.jermese.service.CalculatorService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Adam
 */
@Path("calculate")
public class CalculatorEndpoint {
    
    @Inject
    private CalculatorService calculatorService;
    
    @GET
    @Path("doubleOf/{number}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer doubleOf(@PathParam("number") int number){
        return calculatorService.doubleOf(number);
    }
}
