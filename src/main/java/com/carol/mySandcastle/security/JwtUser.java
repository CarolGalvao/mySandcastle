//package com.carol.mySandcastle.security;
//
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//@AllArgsConstructor
//@NoArgsConstructor
//public class JwtUser implements UserDetails {
//
//    private Long id;
//    private String username;
//    private String password;
//    private Collection<? extends GrantedAuthority> authorities;
//
//    //COmo coloquei o @AllArgsConstructor nao preciso fazer o construtor
////    public JwtUser (Long id, String username, String password, Collection<? extends GrantedAuthority> authorities){
////        this.id= id;
////        this.username = username;
////        this.password = password;
////        this.authorities = authorities;
////
////    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}
