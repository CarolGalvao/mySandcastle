//package com.carol.mySandcastle.security.entities;
//
//import com.carol.mySandcastle.security.enums.ProfileEnum;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//@Table(name ="user")
//public class User implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @Column(name = "email", nullable = false)
//    private String email;
//    @Column(name = "password", nullable = false)
//    private String password;
//    @Column(name = "profile", nullable = false)
//    private ProfileEnum profile;
//
//    public ProfileEnum getProfile() {
//        return profile;
//    }
//}
