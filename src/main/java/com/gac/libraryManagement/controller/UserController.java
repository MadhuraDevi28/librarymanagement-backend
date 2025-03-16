package com.gac.libraryManagement.controller;

import com.gac.libraryManagement.entity.UserDetails;
import com.gac.libraryManagement.repository.UserRepository;
import com.gac.libraryManagement.service.UserDetailsService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserDetailsService userDetailsService;

    public UserController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("API is working");
    }
    @GetMapping("/getUser")
    public ResponseEntity<List<UserDetails>> getUser() {
        return ResponseEntity.ok(userDetailsService.getAllUserDetails());
    }

    @PostMapping("/registerUser")
    public ResponseEntity<UserDetails> registerNewUser(@RequestBody UserDetails userDetails) {
        return ResponseEntity.ok(userDetailsService.registerNewUser(userDetails));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDetails> login(@RequestBody UserDetails userDetails) {
        if (userDetails.getEmailId() != null && userDetails.getPassword() != null) {
            return ResponseEntity.ok(userDetailsService.login(userDetails));
        } else {
            return null;
        }
    }
}
