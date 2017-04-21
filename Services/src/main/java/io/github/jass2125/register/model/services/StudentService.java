/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.register.model.services;

import io.github.jass2125.register.model.exceptions.PersistenceException;
import io.github.jass2125.register.model.entity.Student;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import io.github.jass2125.register.beans.StudentDao;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 * @since Apr 21, 2017 1:01:23 AM
 */
@Stateless
@Remote(StudentServiceImp.class)
public class StudentService implements StudentServiceImp {

    @EJB
    private StudentDao repository;

    @Override
    public void cadastrarAluno(Student student) {
        try {
            System.out.println("Chamando Service");
            repository.salvar(student);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

    }

}
