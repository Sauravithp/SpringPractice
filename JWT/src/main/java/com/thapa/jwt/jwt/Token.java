package com.thapa.jwt.jwt;

import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

@Component
public class Token {
    public String jwtCreater(){
        Algorithm algorithm=Algorithm.HMAC256("secret");
        String token= com.auth0.jwt.JWT.create().withIssuer("auth0").sign(algorithm);
        return token;
    }
}
