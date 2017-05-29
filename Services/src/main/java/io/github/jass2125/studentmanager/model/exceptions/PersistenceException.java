/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.model.exceptions;

/**
 *
 * @author <a href="https://github.com/jass2125" target="_blank">Anderson Souza</a>
 * @since Apr 21, 2017 00:38:12 PM
 */
public class PersistenceException extends Exception {

    public PersistenceException(Exception e, String msg) {
        super(msg, e);
    }

}
