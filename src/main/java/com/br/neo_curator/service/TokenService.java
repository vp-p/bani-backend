package com.br.neo_curator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Value("${JWT_SECRET}")
    private String secret;

    public String getSecret() {
        return secret;
    }

    /*public String generateToken(User user) {
        try{
            Algorithm algorithm = Algorithm.HMAC256()
        }catch(){

        }
       }*/
}
