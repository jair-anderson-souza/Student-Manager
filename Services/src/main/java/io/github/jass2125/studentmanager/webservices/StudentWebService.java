/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.webservices;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.github.jass2125.studentmanager.model.entity.Student;
import java.util.List;
import javax.ws.rs.GET;
import io.github.jass2125.studentmanager.model.services.StudentService;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 * @since Apr 20, 2017 11:52:50 PM
 */
@Path("student")
@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8", MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8", MediaType.APPLICATION_XML})
public class StudentWebService {

    @EJB
    private StudentService service;

    @GET
    public GenericEntity<List<Student>> getAllStudents() {
        List<Student> list = service.getAll();
        System.out.println(list.size());
        return new GenericEntity<List<Student>>(list) {
        };
    }

    @GET
    @Path("{id}")
    public Student getAllStudents(@PathParam("id") Long id) {
        return service.getStudentById(id);
    }

    @POST
    public Student registerStudent(Student student) {
        System.out.println("sdjhf");
        return service.saveStudent(student);
    }

    @DELETE
    @Path("{id}")
    public Student deleteStudent(@PathParam("id") Long id) {
        return service.delete(id);
    }

    @PUT
    public Student updateStudent(Student student) {
        return service.update(student);
    }
}
