//package com.example.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.manager.EmailService;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private EmailService emailService;
//
//    @GetMapping("/sendEmail")
//    public String sendEmail() {
//        emailService.sendSimpleEmail("pavanikangundi@gmail.com", "Test Email", "This is a test email.");
//        return "Email Sent!";
//    }
//}
