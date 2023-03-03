package com.examen.backend.dto;

import lombok.Data;

import javax.persistence.*;

/**
 * Objeto de base de datos
 */
@Entity
@Table(name = "PERSON")
@Data
public class Person {
    /**
     * Llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surnames")
    private String surnames;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "curp")
    private String curp;
    @Column(name = "age")
    private byte age;
    @Column(name = "sex")
    private String sex;
    @Column(name = "nationality")
    private String nationality;

}
