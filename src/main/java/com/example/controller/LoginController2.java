package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Recruiter;
import com.example.repository.RecruiterRepository;

@RestController
@RequestMapping("/api")
public class LoginController2 {

    @Autowired
    private RecruiterRepository recruiterRepository;

    @PostMapping("/validateLogin2")
    public ResponseEntity<Map<String, String>> validateLogin(@RequestParam String email, 
                                                             @RequestParam String password) {
        // Fetch recruiter using the provided username (as Long) and password
        Recruiter recruiter = recruiterRepository.findByEmailAndPassword(email, password);

        Map<String, String> response = new HashMap<>();

        if (recruiter != null) {
            // If credentials are valid, return success message
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        } else {
            // If credentials are invalid, return error message
            response.put("message", "Invalid credentials");
            return ResponseEntity.status(401).body(response);
        }
    }
}
