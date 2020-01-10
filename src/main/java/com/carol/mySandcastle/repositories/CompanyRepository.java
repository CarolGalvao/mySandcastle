package com.carol.mySandcastle.repositories;

import com.carol.mySandcastle.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findByCnpj(String cnpj);
    Company findFirstById (Long id);
    void deleteById (Long id);
}
