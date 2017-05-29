/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.model.enums;

/**
 *
 * @author Anderson Souza
 */
public enum NacionalitydeEnum {
    ARG("Argentina"), PER("Peru"), BRA("Brazil"),
    COL("Colombia"), VEN("Venezuela"), CHI("Chile"),
    EQU("Ecuador"), BOL("Bolivia"), URU("Uruguay"),
    PAR("Paraguay"), SUR("Suriname"), GUI("Guyana");

    private String nacionality;

    private NacionalitydeEnum(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

}
