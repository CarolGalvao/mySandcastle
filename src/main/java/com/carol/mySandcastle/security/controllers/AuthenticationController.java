//package com.carol.mySandcastle.security.controllers;
//
//import com.carol.mySandcastle.response.Response;
//import com.carol.mySandcastle.security.dto.JwtAuthenticationDto;
//import com.carol.mySandcastle.security.dto.TokenDto;
//import com.carol.mySandcastle.security.utils.JwtTokenUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/auth")
//@CrossOrigin( origins = "*")
//@Slf4j
//public class AuthenticationController {
//
//    private static final String TOKEN_HEADER = "Authorization";
//    private static final String BEARER_PREFIX = "Bearer ";
//
////faltou um @Autowired aqui... mas nao sei como colocar o qualifier dele
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
//    @Qualifier("jwtUserDetailsServiceImpl")
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @PostMapping
//    public ResponseEntity<Response<TokenDto>> buildTokenJwt(@Valid @RequestBody JwtAuthenticationDto authenticationDto,
//                                                            BindingResult result) throws AuthenticationException{
//        Response<TokenDto> response = new Response<TokenDto>();
//        if(result.hasErrors()){
//            log.error("Erro validando lançamento:{}", result.getAllErrors());
//            result.getAllErrors().forEach(objectError -> response.getErrors().add(objectError.getDefaultMessage()));
//            return ResponseEntity.badRequest().body(response);
//        }
//
//        log.info("Gerando token para o email {}", authenticationDto.getEmail());
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                authenticationDto.getEmail(), authenticationDto.getPassword()));
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationDto.getEmail());
//        String token = jwtTokenUtil.getToken(userDetails);
//        response.setData(new TokenDto(token));
//        return ResponseEntity.ok(response);
//    }
//
//    @PostMapping(value = "refresh")
//    public ResponseEntity<Response<TokenDto>> buildRefreshTokenJwt(HttpServletRequest request){
//        log.info("Gerando refresh token JWT.");
//        Response<TokenDto> response = new Response<TokenDto>();
//        Optional<String> token = Optional.ofNullable(request.getHeader(TOKEN_HEADER));
//
//        if(token.isPresent() && token.get().startsWith(BEARER_PREFIX)){
//            token = Optional.of(token.get().substring(7));
//        }
//
//        if(!token.isPresent()){
//            response.getErrors().add("Token não informado.");
//        }else if (!jwtTokenUtil.tokenValid(token.get())){
//            response.getErrors().add("Token inválido ou expirado.");
//        }
//
//        if(!response.getErrors().isEmpty()){
//            return ResponseEntity.badRequest().body(response);
//        }
//
//        String refreshedToken = jwtTokenUtil.refreshToken(token.get());
//        response.setData(new TokenDto(refreshedToken));
//
//        return ResponseEntity.ok(response);
//    }
//}
