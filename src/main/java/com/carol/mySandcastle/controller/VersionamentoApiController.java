//package com.carol.mySandcastle.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class VersionamentoApiController {
//
//    @GetMapping(value = "v1/ola/{name}")
//    public ResponseEntity<String> helloNameV1 (@PathVariable("name") String name){
//        return ResponseEntity.ok(String.format("API v1: Hello %s!", name));
//    }
//
//    @GetMapping(value = "v2/ola/{name}")
//    public ResponseEntity<String> helloNameV2 (@PathVariable("name") String name){
//        return ResponseEntity.ok(String.format("API v2: Hello %s!", name));
//    }
//
//    @GetMapping(value = "ola/{name}", headers = "X-API-Version=v1")
//    public ResponseEntity<String> helloNameHeaderV1(@PathVariable("name") String name){
//        return ResponseEntity.ok(String.format("API Header v1: Hello %s", name));
//    }
//
//    @GetMapping(value = "ola/{name}", headers = "X-API-Version=v2")
//    public ResponseEntity<String> helloNameHeaderV2(@PathVariable("name") String name){
//        return ResponseEntity.ok(String.format("API Header v2: Hello %s", name));
//    }
//}
