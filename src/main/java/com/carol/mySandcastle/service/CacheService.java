package com.carol.mySandcastle.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CacheService {

    @Cacheable("exampleCache")
    public String exampleCache(){
        log.info("##Executando o serviço");
        return "Teste de exemplo de cache";
    }
}
