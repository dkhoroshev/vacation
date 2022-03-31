package com.sfbtech.vacation.controller;

import com.sfbtech.vacation.dao.PersonRepository;
import com.sfbtech.vacation.model.PersonEntity;
import com.sfbtech.vacation.service.PersonQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/account")
public class PersonQueryController {

    private final PersonQueryService personQueryService;

    public PersonQueryController(PersonQueryService personQueryService) {
        this.personQueryService = personQueryService;
    }

    @GetMapping("/{personId}")
    public ResponseEntity<PersonEntity> getPersonEntityById(@PathVariable(value = "personID") Long personId) {
        Optional<PersonEntity> personOpt = personQueryService.getPersonEntityByID(personId);
        return personOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/list")
    public List<PersonEntity> getPersons() {
        return personQueryService.getPersonEntities();
    }

}
