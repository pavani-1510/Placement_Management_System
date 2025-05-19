package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.entity.Jobs;
import com.example.manager.JobsManager;

@RestController
@RequestMapping("/api")
public class ViewJobsController {

    @Autowired
    private JobsManager jobService;

    @GetMapping("/jobs")
    public List<Jobs> getAllJobs() {
        try {
            return jobService.getAllJobs();  // Ensure this is returning a valid list
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching jobs", e);
        }
    }
    @GetMapping("/jobsa")
    public List<Jobs> getAllJobsA() {
        try {
            return jobService.getAllJobs();  // Ensure this is returning a valid list
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching jobs", e);
        }
    }
    @GetMapping("/jobsr")
    public List<Jobs> getAllJobsR() {
        try {
            return jobService.getAllJobs();  // Ensure this is returning a valid list
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching jobs", e);
        }
    }
}
