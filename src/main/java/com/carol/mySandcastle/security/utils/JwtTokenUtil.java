package com.carol.mySandcastle.security.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {

    static final String CLAIM_KEY_USERNAME = "sub"; //nome do usuário
    static final String CLAIM_KEY_ROLE = "role"; //perfil do usuário
    static final String CLAIM_KEY_CREATED = "created"; //definição de quando ele foi cirado

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String getUsernameFromToken (String token){

        String username;

        try{
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        }catch (Exception e){
            username =null;
        }

        return username;
    }

    public Date getExpirationDateFromToken(String token){

        Date expiration;

        try{
            Claims claims= getClaimsFromToken(token);
            expiration = claims.getExpiration();
        }catch (Exception e){
            expiration=null;
        }

        return expiration;
    }

    public String refreshToken(String token){

        String refreshedToken = null;

        try {
            Claims claims = getClaimsFromToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
        }catch (Exception e){
            refreshedToken = null;
        }

        return refreshedToken;
    }

    public boolean tokenValid(String token){
        return !tokenExpired(token);
    }

    //aqui ele cria um token
    public String getToken (UserDetails userDetails){
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        userDetails.getAuthorities().forEach(
                authority -> claims.put(CLAIM_KEY_ROLE, authority.getAuthority()));
        claims.put(CLAIM_KEY_CREATED, new Date());

        return buildToken(claims);
    }

    //sem o secret vc nao consegue ver os dados do token, por uma questão de segurança
    private Claims getClaimsFromToken(String token){
        Claims claims;
        try{
            claims = Jwts.parser().setSigningKey(secret)
                    .parseClaimsJws(token).getBody();
        } catch(Exception e){
            claims = null;
        }
        return claims;
    }

    private Date buildDateExpiration(){
        return new Date(System.currentTimeMillis() + expiration *10000);
    }

    private boolean tokenExpired(String token){
        Date dateExpiration = this.getExpirationDateFromToken(token);
        if(dateExpiration == null){
            return false;
        }
        return dateExpiration.before(new Date());
    }

    private String buildToken(Map<String, Object> claims){
        return Jwts.builder().setClaims(claims).setExpiration(buildDateExpiration())
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }
    // a cahve usando de novo aqui garente a integridade do token


}
