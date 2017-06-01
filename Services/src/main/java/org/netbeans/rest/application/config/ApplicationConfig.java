/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import io.github.jass2125.studentmanager.filter.CorsFilter;
import io.github.jass2125.studentmanager.webservices.StudentWebService;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @since May 25, 2017 9:00:20 PM
 */
@ApplicationPath("webapi")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();
        addResources(resources);
        return resources;
    }

    private void addResources(Set<Class<?>> set) {
        set.add(CorsFilter.class);
        set.add(StudentWebService.class);
    }

}
