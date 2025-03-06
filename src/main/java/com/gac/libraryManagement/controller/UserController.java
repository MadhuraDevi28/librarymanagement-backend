package com.gac.libraryManagement.controller;

import com.gac.libraryManagement.entity.UserDetails;
import com.gac.libraryManagement.repository.UserRepository;
import com.gac.libraryManagement.service.UserDetailsService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserDetailsService userDetailsService;

    public UserController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @GetMapping("/getUser")
    public ResponseEntity<List<UserDetails>> getUser() {
        return ResponseEntity.ok(userDetailsService.getAllUserDetails());
    }

    @PostMapping("/registerUser")
    public ResponseEntity<UserDetails> registerNewUser(@RequestBody UserDetails userDetails) {
        return ResponseEntity.ok(userDetailsService.registerNewUser(userDetails));
    }

    @GetMapping("/login")
    public ResponseEntity<UserDetails> login(@RequestBody UserDetails userDetails) {
        if (userDetails.getEmailId() != null && userDetails.getPassword() != null) {
            return ResponseEntity.ok(userDetailsService.login(userDetails));
        } else {
            return null;
        }
    }
}
