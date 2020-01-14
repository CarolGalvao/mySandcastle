package com.carol.mySandcastle.DTO;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "id")
public class CompanyDTO {

    private Long id;
    private String companyName;
    private String cnpj;
}
