package com.examen.backend.dao;

import com.examen.backend.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio con el cual se realizan operaciones a base de datos
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    /**
     * Búsqueda de una persona por su id
     * @param id el identificador de la persona
     * @return una persona si se encuentra con el id indicado
     */
    Optional<Person> findById(Long id);
}
