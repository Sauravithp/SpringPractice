package com.thapa.jwt.utility;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;


public class TokenHandler {
    public static String jwtCreater() {
        Algorithm algorithm = Algorithm.HMAC256("secret");
        return JWT.create().withIssuedAt(new Date()).sign(algorithm);
    }

    public static Boolean jwtValidator(String header) {
        Algorithm algorithm = Algorithm.HMAC256("secret");
        System.out.println(algorithm);
        JWTVerifier verifier = JWT.require(algorithm).ignoreIssuedAt().build();
        System.out.println(verifier);
        DecodedJWT jwt = verifier.verify(header);
        System.out.println(jwt);
        if (jwt != null) {
            return true;
        }
        return false;
    }
}
