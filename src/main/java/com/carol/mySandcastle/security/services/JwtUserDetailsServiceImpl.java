//package com.carol.mySandcastle.security.services;
//
//import com.carol.mySandcastle.security.JwtUserFactory;
//import com.carol.mySandcastle.security.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class JwtUserDetailsServiceImpl implements UserDetailsService {
//
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> employee = userService.findByEmail((username));
//
//        if(employee.isPresent()){
//            return JwtUserFactory.create(employee.get());
//        }
//
//        throw new UsernameNotFoundException("Email não encontrado.");
//    }
//}
