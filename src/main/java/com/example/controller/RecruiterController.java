package com.example.controller;

import java.util.HashMap;
import com.example.manager.EmailService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Application;
import com.example.entity.Recruiter;
import com.example.manager.RecruiterManager;
import com.example.repository.RecruiterRepository;

@RestController
@RequestMapping("/api")
public class RecruiterController {

    @Autowired
    private RecruiterRepository recruiterRepository;
    
    @Autowired
    private RecruiterManager recruiterManager;

    @Autowired
    private EmailService emailService;

    // POST endpoint for adding a recruiter
    @PostMapping("/recruiteradd")
    public void addRecruiter(@RequestParam String name, 
                                                            @RequestParam String email, 
                                                            @RequestParam String phone, 
                                                            @RequestParam String company, 
                                                            @RequestParam String password) {
        // Create the recruiter object and set its properties
        Recruiter recruiter = new Recruiter();
        recruiter.setName(name);
        recruiter.setEmail(email);
        recruiter.setPhone(phone);
        recruiter.setCompany(company);
        recruiter.setPassword(password);
        
        // Save the recruiter to the repository
        recruiterRepository.save(recruiter);
        String subject = "Signup Confirmation";
        String body = "Dear " + name+ ",\n\nThank you for requesting as Recruiter as . Your password is: "+password+" and we used your mail.";
        emailService.sendEmail(email, subject, body);

        // Prepare response
        Map<String, String> response = new HashMap<>();
        response.put("message", "Adding successful and confirmation email sent.");
//        return ResponseEntity.ok(response);

        // Redirect to the admin dashboard after the recruiter is added
//        return "adminDashboard";
    }
    @GetMapping("/allrecruiters")
    public List<Recruiter> getAllRecruiter(@RequestParam(required = false) String username) {
        return recruiterManager.getRecruiters();
    }
}
