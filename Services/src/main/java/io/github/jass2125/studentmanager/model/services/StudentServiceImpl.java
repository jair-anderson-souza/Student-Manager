/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.model.services;

import io.github.jass2125.studentmanager.beans.StudentDao;
import io.github.jass2125.studentmanager.model.dao.StudentDaoImp;
import io.github.jass2125.studentmanager.model.entity.Student;
import io.github.jass2125.studentmanager.model.exceptions.PersistenceException;
import java.util.Collections;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 * @since Apr 21, 2017 1:01:23 AM
 */
@Stateless
@Local(StudentService.class)
public class StudentServiceImpl implements StudentService {

    private StudentDao repository = new StudentDaoImp();

    @Override
    public Student saveStudent(Student student) {
        try {
            return repository.save(student);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
//        System.out.println("sdfsd");
//        return Collections.EMPTY_LIST;
        return repository.getAllStudents();
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Student delete(Long id) {
        return repository.delete(id);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

}
