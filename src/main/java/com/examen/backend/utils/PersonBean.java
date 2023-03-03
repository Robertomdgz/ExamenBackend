package com.examen.backend.utils;

import com.examen.backend.dto.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase bean para trabajar con el objeto person en el controlador
 * y evitar exponer la entidad de jpa.
 */
@NoArgsConstructor
@Data
public class PersonBean {
    private Long id;
    private String name;
    private String surnames;
    private String rfc;
    private String curp;
    private byte age;
    private String sex;
    private String nationality;

    /**
     * Constructor del bean Person
     * @param person Entidad de jpa para llenar datos
     */
    public PersonBean(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.surnames = person.getSurnames();
        this.rfc = person.getRfc();
        this.curp = person.getCurp();
        this.age = person.getAge();
        this.sex = person.getSex();
        this.nationality = person.getNationality();
    }
}
