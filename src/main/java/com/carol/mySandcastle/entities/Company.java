package com.carol.mySandcastle.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String cnpj;
    private Date creationDate;
    private Date updateDate;

    public String toString(){
        return "Companu [id=" + id + ", companyName=" +
                         companyName + ", cnpj=" + cnpj +
                        ", crationDate=" + creationDate +
                        ", updateDate=" + updateDate + "]";
    }
    
}
