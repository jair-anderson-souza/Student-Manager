/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.register.model.dao;

import io.github.jass2125.register.beans.StudentDao;
import io.github.jass2125.register.model.exceptions.PersistenceException;
import io.github.jass2125.register.model.entity.Student;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@Remote(StudentDao.class)
public class StudentDaoImp implements StudentDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Student student) throws PersistenceException {
        System.out.println("Chamando repository");
        try {
            em.persist(student);
        } catch (Exception e) {
            throw new PersistenceException(e, "Verifique os dados e tente novamente.");
        }
    }
}
