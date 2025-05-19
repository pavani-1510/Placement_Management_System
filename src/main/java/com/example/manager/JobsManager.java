package com.example.manager;

import com.example.entity.Jobs;
import com.example.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsManager {

    @Autowired
    private JobsRepository jobsRepository;

    // Insert data
    public String addJob(Jobs j1) {
        jobsRepository.save(j1); // Spring Data JPA handles transaction automatically
        return "Insertion done successfully";
    }

    // Update data
    public String updateData(Jobs j1) {
        if (jobsRepository.existsById(j1.getSid())) {
            jobsRepository.save(j1); // This will update the entity if it already exists
            return "Updation done successfully";
        }
        return "Job not found";
    }

    // Delete data
    public String deleteData(Jobs j1) {
        if (jobsRepository.existsById(j1.getSid())) {
            jobsRepository.deleteById(j1.getSid());
            return "Deletion done successfully";
        }
        return "Job not found";
    }

    // Retrieve data
    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll(); // Spring Data JPA handles retrieving all records
    }

	public int getTotalJobs() {
        return (int) jobsRepository.count(); // This returns the total number of jobs
		
	}
}
