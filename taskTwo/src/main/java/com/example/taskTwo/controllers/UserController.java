package com.example.taskTwo.controllers;



import com.example.taskTwo.entities.User;
import com.example.taskTwo.repos.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class UserController {



    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){



        this.userRepository=userRepository;
    }
    @GetMapping

    public List<User> getAllUsers(){

        return userRepository.findAll();
    }

    @PostMapping("/{value}")
    public User createUser(@RequestBody User newUser, @PathVariable String value){

        return  userRepository.save(newUser);
    }


}
