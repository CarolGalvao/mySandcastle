package com.carol.mySandcastle.security;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, org.springframework.security.core.AuthenticationException e)
            throws IOException, ServletException {
        httpServletResponse.sendError( 1,"Acesso negado. Você deve estar autenticado no sistema" +
                "para acessar a URL solicitada.");
    }
}
