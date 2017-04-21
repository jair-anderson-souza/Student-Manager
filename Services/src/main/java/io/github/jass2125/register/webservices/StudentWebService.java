/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.register.webservices;

import io.github.jass2125.register.model.entity.Student;
import static io.github.jass2125.register.webservices.StudentWebService.CHARSET;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.github.jass2125.register.model.services.StudentServiceImp;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 * @since Apr 20, 2017 11:52:50 PM
 */
@Path("/student")
@Produces(MediaType.APPLICATION_JSON + CHARSET)
@Consumes(MediaType.APPLICATION_JSON + CHARSET)
public class StudentWebService {
    @EJB
    private StudentServiceImp service;
    
    public static final String CHARSET = ";charset=utf-8";
    
    @POST
    @Produces(MediaType.APPLICATION_JSON + CHARSET)
    public void registerStudent(Student student) {
        System.out.println("Teste Post Method");
        service.cadastrarAluno(student);
    }
}
