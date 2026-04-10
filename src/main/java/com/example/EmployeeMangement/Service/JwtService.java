package com.example.EmployeeMangement.Service;

import com.nimbusds.jwt.JWT;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService{
    public String generateKey(String username){
        Map<String , Object> claims = new HashMap<>();

       return Jwts.builder()
               .claims()
               .add(claims)
               .subject()
    }
}
