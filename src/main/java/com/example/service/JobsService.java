package com.example.service;

import com.example.entity.Jobs;
import com.example.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsService {
    @Autowired
    private JobsRepository jobsRepository;

    public List<Jobs> retrieveData() {
        return jobsRepository.findAll();
    }
}
