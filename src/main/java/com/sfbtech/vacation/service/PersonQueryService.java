package com.sfbtech.vacation.service;

import com.sfbtech.vacation.dao.PersonRepository;
import com.sfbtech.vacation.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonQueryService {

    @Autowired
    private PersonRepository personRepository;

    public Optional<PersonEntity> getPersonEntityByID(Long personEntityID){
        return personRepository.findById(personEntityID);
    }

    public List<PersonEntity> getPersonEntities() {
        return personRepository.findAll();
    }
}
