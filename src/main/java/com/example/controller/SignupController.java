package com.example.controller;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.manager.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SignupController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> signup(@RequestParam String username,
                                                      @RequestParam String email,
                                                      @RequestParam String number,
                                                      @RequestParam String password,
                                                      @RequestParam String sname) {

        // Create new student object with the received data
        Student student = new Student(username, email, number, password, sname);

        // Save the student object in the database
        studentRepository.save(student);

        // Send confirmation email
        String subject = "Signup Confirmation";
        String body = "Dear " + sname + ",\n\nThank you for signing up. Your username is: " + username;
        emailService.sendEmail(email, subject, body);

        // Prepare the response
        Map<String, String> response = new HashMap<>();
        response.put("message", "Signup successful and confirmation email sent.");
        return ResponseEntity.ok(response);
    }
}
