package com.example.controller;

import com.example.entity.Application;
import com.example.manager.ApplicationManager;
import com.example.manager.JobsManager;
import com.example.repository.ApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    private ApplicationManager applicationService;
    

    @Autowired
    private JobsManager jobService;
    
    
    @Autowired
    private ApplicationRepository applicationRepository;

    @PostMapping("/apply")
    public ResponseEntity<String> applyForJob(@RequestBody Application application) {
        application.setStatus("Applied");
        applicationService.saveApplication(application);
        return ResponseEntity.ok("Application submitted successfully!");
    }

    @GetMapping("/applications")
    public List<Application> getApplications(@RequestParam String username) {
        return applicationService.getApplicationsByUsername(username);
    }
//    @GetMapping("/applications/status-summary")
//    public Map<String, Long> getApplicationStatusSummary(@RequestParam String username) {
//        List<Application> applications = applicationService.getApplicationsByUsername(username);
//        
//        // Count applications by their status
//        return applications.stream()
//            .collect(Collectors.groupingBy(Application::getApplicationStatus, Collectors.counting()));
//    }


    @GetMapping("/allapplications")
    public List<Application> getAllApplications() {
        return applicationService.getApplications();
    }

    @GetMapping("/application/{appid}")
    public Application getApplicationByAppid(@PathVariable int appid) {
        return applicationRepository.findByAppid(appid);
    }

    @PostMapping("/updateStatus")
    public ResponseEntity<String> updateStatus(@RequestBody Map<String, Object> payload) {
        int appid = (int) payload.get("appid");
        String status = (String) payload.get("status");

        Application application = applicationRepository.findById(appid).orElse(null);
        if (application != null) {
            application.setStatus(status);
            applicationRepository.save(application);
            return ResponseEntity.ok("Status updated successfully!");
        } else {
            return ResponseEntity.badRequest().body("Application not found!");
        }
    }
}
