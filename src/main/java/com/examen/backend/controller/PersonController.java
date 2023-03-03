package com.examen.backend.controller;

import com.examen.backend.service.PersonService;
import com.examen.backend.utils.PersonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
/**
 * Esta clase es un rest controller para el trabajo con personas
 */
public class PersonController {
    @Autowired
    PersonService service;

    /**
     * Este método permite obtener
     * @param id
     * @return
     */
    @GetMapping(value = {"/person", "/person/{id}","/people"})
    public ResponseEntity<List<PersonBean>> getPeopleById(@PathVariable(required = false) Long id) {
        try {
            log.debug("Obteniendo personas o persona por id: {0}", id);
            List<PersonBean> people = service.findById(id);
            return new ResponseEntity<>(people, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
