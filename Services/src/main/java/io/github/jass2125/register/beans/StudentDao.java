/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.register.beans;

import io.github.jass2125.register.model.exceptions.PersistenceException;
import io.github.jass2125.register.model.entity.Student;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson
 * Souza</a>
 */
public interface StudentDao {

    public void salvar(Student student) throws PersistenceException;
}
