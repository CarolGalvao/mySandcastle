package com.carol.mySandcastle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    @GetMapping(value = "/{name}")
    public String example (@PathVariable("name") String name){
        return "Olá " + name;
    }
}
