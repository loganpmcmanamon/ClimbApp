package com.logan.climbappv2.controller;

import com.logan.climbappv2.model.User;
import com.logan.climbappv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

}
