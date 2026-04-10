package com.example.EmployeeMangement.Service;

import com.example.EmployeeMangement.Repository.UsersRepo;
import com.example.EmployeeMangement.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepo usersRepo;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    private final JwtService jwtService;

    public Users getRegistration(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));

        return usersRepo.save(users);
    }

    public String login(Users users) {
        Authentication authentication = authenticationManager.authenticate
                (new UsernamePasswordAuthenticationToken(users.getUsername() , users.getPassword()));

        if(authentication.isAuthenticated()){
            return jwtService.generateKey(users.getUsername());
        }
        return "Fail";
    }
}
