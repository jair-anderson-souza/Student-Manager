/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.model.services;

import io.github.jass2125.studentmanager.model.entity.Student;
import java.util.List;


/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 * @since Apr 21, 2017 1:00:54 AM
 */
public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAll();

    public Student getStudentById(Long id);

    public Student delete(Long id);

    public Student update(Student student);
}
