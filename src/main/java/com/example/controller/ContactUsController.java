package com.example.controller;

import com.example.entity.ContactUs;
import com.example.manager.ContactusManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactUsController {

    @Autowired
    private ContactusManager contactUsService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitForm(@RequestBody ContactUs contactUs) {
        contactUsService.saveContactUs(contactUs);
        return ResponseEntity.ok("Message received successfully!");
    }
}
