/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.register.model.entity;

import io.github.jass2125.register.model.utils.NacionalitydeEnum;
import io.github.jass2125.register.model.utils.GenderEnum;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author <a href="https://github.com/jass2125">Anderson Souza</a>
 * @since Apr 21, 2017 0:30:12 AM
 */
@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 40)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private GenderEnum gender;

    @Column(length = 20)
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private NacionalitydeEnum nacionalidade;

    @Column(unique = true, length = 20)
    private String identityBr;

    @Column(unique = false, length = 20)
    private String cpf;

    @Column(unique = true, length = 20)
    private String militaryDocumentNumber;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public NacionalitydeEnum getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalitydeEnum nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdentityBr() {
        return identityBr;
    }

    public void setIdentityBr(String identityBr) {
        this.identityBr = identityBr;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMilitaryDocumentNumber() {
        return militaryDocumentNumber;
    }

    public void setMilitaryDocumentNumber(String militaryDocumentNumber) {
        this.militaryDocumentNumber = militaryDocumentNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
