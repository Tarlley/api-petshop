package com.devtarlley.apipetshop.security;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;
import java.util.Date;

/* Criar a autenticação e retornar a autenticação JWT*/
@Service
public class JWTTokenAuthenticationService {

    // expiração do token em milessegundos
    public static final long EXPIRATION_TIME = 21600000L;

    public static final String SECRET = "meusFilhos!";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER = "Authorization";

    /*Gera o token e da a resposta para o cliente JWT*/
    public void addAuthentication(HttpServletResponse response, String username) throws Exception{

        // Montagem do token

        String JWT = Jwts.builder()
                .setSubject(username) // adiciona o usuário
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRATION_TIME)) // seta uma data de expiração do token
                .signWith(SignatureAlgorithm.HS512,SECRET).compact();


        String token = TOKEN_PREFIX + JWT;

        response.addHeader(HEADER,token);

         response.getWriter().write("{\"Authorization\":\"" + token + "\"}");
    }

}
