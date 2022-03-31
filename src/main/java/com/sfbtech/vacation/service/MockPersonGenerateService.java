package com.sfbtech.vacation.service;

import com.github.javafaker.Faker;
import com.sfbtech.vacation.dao.PersonRepository;
import com.sfbtech.vacation.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MockPersonGenerateService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonIdGenerateService personIdGenerateService;

    public void generatePersons() {
        Faker faker = new Faker(new Locale("ru"));
        for (int i = 0; i < 10; i++) {
            personRepository.save(
                    PersonEntity.builder()
                            .id(personIdGenerateService.newPersonEntityId())
                            .firstName(faker.name().firstName())
                            .lastName(faker.name().lastName())
                            .patronymic(faker.esports().game())
                            .build()
            );
        }

    }
}
