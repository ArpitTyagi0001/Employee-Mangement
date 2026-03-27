package com.example.EmployeeMangement.Service;

import com.example.EmployeeMangement.Repository.UsersRepo;
import com.example.EmployeeMangement.entity.UserDetailsPrinciple;
import com.example.EmployeeMangement.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserdetailsService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepo.findByUsername(username);

        if(users==null){
            System.out.println("users not found by username:" +username);
            throw new UsernameNotFoundException("users not found by username:" +username);
        }
        return new UserDetailsPrinciple(users);
    }
}
