package com.carol.mySandcastle.DTO;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "id")
public class CompanyDTO {

    private Long id;
    private String companyName;
    private String cnpj;

    @NotEmpty(message = "Nome da empresa não pode ser vazia.")
    @Length(min = 5, max = 200, message = "Nome da empresa deve conter entre 5 e 200 caracteres.")
    public String getCompanyName(){
        return companyName;
    }

    @NotEmpty(message = "CNPJ não pode ser vazio")
    @CNPJ(message = "CNPJ inválido")
    public String getCnpj(){
        return cnpj;
    }
}
