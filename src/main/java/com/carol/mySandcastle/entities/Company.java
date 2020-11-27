//package com.carol.mySandcastle.entities;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
////import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//
////Tudo que esta comentando é do jpa q parou de funcionar qnd coloquei a dependencia do mongo
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
////@Entity //​ informa​ ​ ao​ ​ JPA​ ​ que​ ​ essa​ ​ classe​ ​ se​ ​ trata​ ​ de​ ​ uma​ ​ entidade​ ​ JPA
////@Table(name = "company") //permite definir o nome da tabela no banco de dados para a entidade
//@Document(collection = "Company")
//public class Company implements Serializable {
//
//    @Id
////    @GeneratedValue(strategy= GenerationType.AUTO) // informa como a chave primária será incrementada
//    //para o JPA eu utilizo um Long para o Id, mas para o mongo usa uma String porque o id é um hash q pode conter tanto numero quanto letras
//    private String id;
////    @Column(name="company_name", nullable = false)
//    private String companyName;
////    @Column(name="cnpj", nullable = false)
//    private String cnpj;
////    @Column(name="creation_date", nullable = false)
//    private Date creationDate;
////    @Column(name="update_date", nullable = false)
//    private Date updateDate;
////    @OneToMany (mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private transient List<Employee> employees;
//    private Long age;
//
//
//    @Override
//    public String toString() {
//        return "Company{" +
//                "id=" + id +
//                ", companyName='" + companyName + '\'' +
//                ", cnpj='" + cnpj + '\'' +
//                ", creationDate=" + creationDate +
//                ", updateDate=" + updateDate +
//                '}';
//    }
//
////    @PreUpdate
//    public void preUpdate(){
//        updateDate = new Date();
//    }
//
////    @PrePersist
//    public void prePersist(){
//        final Date current = new Date();
//        creationDate = current;
//        updateDate = current;
//    }
//
//}
