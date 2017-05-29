/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.beans;

import io.github.jass2125.studentmanager.model.entity.Student;
import io.github.jass2125.studentmanager.model.exceptions.PersistenceException;
import java.util.List;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 */
public interface StudentDao {

    public Student save(Student student) throws PersistenceException;

    public Student getById(Long id);

    public List<Student> getAllStudents();

    public Student delete(Long id);

    public Student update(Student student);
}
