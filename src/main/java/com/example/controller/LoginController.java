package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/validateLogin")
    public ResponseEntity<Map<String, String>> validateLogin(@RequestParam String username, 
                                                             @RequestParam String password) {
        // Fetch student using the provided username and password
        Student student = studentRepository.findByUsernameAndPassword(username, password);

        Map<String, String> response = new HashMap<>();

        if (student != null) {
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
