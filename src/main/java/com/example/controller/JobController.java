package com.example.controller;

import com.example.manager.JobsManager;  // Import the service
import com.example.entity.Jobs;        // Import your Job entity
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobsManager jobService;  // Autowire the JobService to fetch data

    // Show the form to add a new job (GET request)
    @GetMapping("/addjob")
    public String showAddJobForm() {
        return "add-job";  // Return the name of the HTML page for the form to add jobs
    }

    // Handle the job submission (POST request)
    @PostMapping("/addjob")
    public String addJob(@RequestParam String sid,
                         @RequestParam String sname,
                         @RequestParam String position,
                         @RequestParam String department,
                         @RequestParam String location,
                         @RequestParam double salary,
                         @RequestParam String jobType,
                         @RequestParam int experienceRequired,
                         @RequestParam String skills,
                         @RequestParam String jobDescription,
                         @RequestParam String companyName,
                         @RequestParam String contactEmail) {

        // Create a new job object
        Jobs job = new Jobs(sid, sname, position, department, location, salary, new java.util.Date(), jobType,
                            experienceRequired, skills, jobDescription, companyName, contactEmail);

        // Save the job using the JobsManager service
        jobService.addJob(job);

        // Redirect to the job listings page after adding the job
        return "redirect:/retrieve";  // This will reload the job listings page
    }
}
