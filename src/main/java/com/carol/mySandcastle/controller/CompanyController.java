package com.carol.mySandcastle.controller;

import com.carol.mySandcastle.DTO.CompanyDTO;
import com.carol.mySandcastle.entities.Company;
import com.carol.mySandcastle.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    @PostMapping
    public ResponseEntity<Response<CompanyDTO>> cadastrar (@Valid @RequestBody CompanyDTO companyDTO,
                                                           BindingResult result){
        Response<CompanyDTO> response = new Response<CompanyDTO>();

        if(result.hasErrors()) {
            result.getAllErrors().forEach( error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }

        companyDTO.setId(1L);
        response.setData(companyDTO);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{name}")
    public String example (@PathVariable("name") String name){
        return "Olá " + name;
    }
}
