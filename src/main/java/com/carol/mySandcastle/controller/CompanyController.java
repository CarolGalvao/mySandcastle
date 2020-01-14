package com.carol.mySandcastle.controller;

import com.carol.mySandcastle.DTO.CompanyDTO;
import com.carol.mySandcastle.entities.Company;
import com.carol.mySandcastle.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    @PostMapping
    public ResponseEntity<Response<CompanyDTO>> cadastrar (@RequestBody CompanyDTO companyDTO){
        Response<CompanyDTO> response = new Response<CompanyDTO>();

        companyDTO.setId(1L);
        response.setData(companyDTO);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{name}")
    public String example (@PathVariable("name") String name){
        return "Olá " + name;
    }
}
