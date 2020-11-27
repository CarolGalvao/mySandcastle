//package com.carol.mySandcastle.security;
//
//import com.carol.mySandcastle.security.entities.User;
//import com.carol.mySandcastle.security.enums.ProfileEnum;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class JwtUserFactory {
//
//
//    private JwtUserFactory(){
//    }
//
//    public static JwtUser create(User user){
//        return new JwtUser(user.getId(), user.getEmail(),
//                user.getPassword(),mapToGrantedAuthorities(user.getProfile()));
//    }
//
//    //esse map converte o usuário criado para o formato do spring secutrity
//
//    private static List<GrantedAuthority> mapToGrantedAuthorities (ProfileEnum profileEnum){
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
//        return authorities;
//    }
//}
