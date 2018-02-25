/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adamclmns.jermese.config;

import com.adamclmns.jermese.rest.service.MarathonFacadeREST;
import com.adamclmns.jermese.rest.service.MarathonRunFacadeREST;
import com.adamclmns.jermese.rest.service.SprintFacadeREST;
import com.adamclmns.jermese.rest.service.SprintRunFacadeREST;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Adam
 */

@ApplicationPath("rest")
public class JermeseService extends Application{
    
        public Set<Class<?>> getClases() {
            Set<Class<?>> classes = new HashSet<Class<?>>();
            classes.add(MarathonFacadeREST.class);
            classes.add(MarathonRunFacadeREST.class);
            classes.add(SprintFacadeREST.class);
            classes.add(SprintRunFacadeREST.class);
            
            return classes;
        }
        
}
