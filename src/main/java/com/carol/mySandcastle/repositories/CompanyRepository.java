//package com.carol.mySandcastle.repositories;
//
//import com.carol.mySandcastle.entities.Company;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import java.util.List;
////import org.springframework.data.jpa.repository.JpaRepository;
//
////para funcionar o JPA colocar isso depois do extends "JpaRepository<Company, Long>"
//public interface CompanyRepository extends MongoRepository<Company,String> {
////Isso era usado para o Jpa:
//    //    Company findByCnpj(String cnpj);
////    Company findFirstById (Long id);
////    void deleteById (Long id);
//
//    Company findByCompanyName(String companyName);
//
//    @Query("{ 'idade: {$gt:70, $lt: 71}")
//    List<Company> findByAgeBetween(int ageIni, int ageFinal);
//}
