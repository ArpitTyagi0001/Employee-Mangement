package com.example.EmployeeMangement.Controller;

import com.example.EmployeeMangement.Service.UserService;
import com.example.EmployeeMangement.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/registration")
    public Users getRegistration(@RequestBody Users users){
        return userService.getRegistration(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody  Users users){
        return userService.login(users);
    }
}
