package com.carol.mySandcastle.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //​ informa​ ​ ao​ ​ JPA​ ​ que​ ​ essa​ ​ classe​ ​ se​ ​ trata​ ​ de​ ​ uma​ ​ entidade​ ​ JPA
@Table(name = "company") //permite definir o nome da tabela no banco de dados para a entidade
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) // informa como a chave primária será incrementada
    private Long id;
    @Column(name="company_name", nullable = false)
    private String companyName;
    @Column(name="cnpj", nullable = false)
    private String cnpj;
    @Column(name="creation_date", nullable = false)
    private Date creationDate;
    @Column(name="update_date", nullable = false)
    private Date updateDate;
    // ****************
    @OneToMany (mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private transient List<Employee> employees;


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
//*********************
//        @PreUpdate
//    public void preUpdate(){
//        updateDate = new Data();
//    }

    @PrePersist
    public void prePersist(){
        final Date current = new Date();
        creationDate = current;
        updateDate = current;
    }

}
