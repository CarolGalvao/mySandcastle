package com.carol.mySandcastle.security.entities;

import com.carol.mySandcastle.security.enums.ProfileEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "email", nullable = false)
    private String email;
    @Enumerated
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "profile", nullable = false)
    private ProfileEnum profile;
}
