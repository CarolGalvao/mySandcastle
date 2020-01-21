package com.carol.mySandcastle.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
    public static String geraBCrypt(String password){
        if( password == null){
            return password;
        }
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }

    public static boolean passwordValidation (String password, String passwordEncoded){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(password,passwordEncoded);
    }
}
