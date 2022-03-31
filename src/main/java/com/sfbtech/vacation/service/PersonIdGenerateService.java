package com.sfbtech.vacation.service;

import org.springframework.stereotype.Service;

@Service
public class PersonIdGenerateService {
    public Long newPersonEntityId(){
        return System.nanoTime();
    }
}
