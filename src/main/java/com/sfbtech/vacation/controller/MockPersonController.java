package com.sfbtech.vacation.controller;

import com.sfbtech.vacation.service.MockPersonGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mockaccount")
public class MockPersonController {
    private final MockPersonGenerateService dummyPersonGenerateService;

    private MockPersonController(MockPersonGenerateService dummyPersonGenerateService){
        this.dummyPersonGenerateService = dummyPersonGenerateService;
    }

    @GetMapping("/generatedummyaccounts")
    public void generateDummyPersons() {
        dummyPersonGenerateService.generatePersons();
    }
}
