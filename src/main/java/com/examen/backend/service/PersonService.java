package com.examen.backend.service;

import com.examen.backend.dao.PersonRepository;
import com.examen.backend.dto.Person;
import com.examen.backend.utils.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Servicio de persona para trabajar con el repositorio
 */
@Service
public class PersonService {
    /**
     * Inyección de dependendcia del repositorio
     */
    @Autowired
    PersonRepository repository;

    /**
     * Método de búsqueda por id
     * @param id Identificador de la persona a buscar
     * @return Un listado con una parsona a la que le pertenece el id o si no
     * se especifica un id se devuelven todos los registros.
     */
    public List<PersonBean> findById(Long id){
        List<PersonBean> people = new ArrayList<>();
        if(id != null && id > 0){
            Optional<Person> person = repository.findById(id);
            if(person.isPresent()) people.add(new PersonBean(person.get()));
        }else{
            List<Person> peopleDTO = repository.findAll();
            for(Person person : peopleDTO){
                people.add(new PersonBean(person));
            }
        }
        return people;
    }

}
