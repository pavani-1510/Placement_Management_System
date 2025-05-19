package com.example.manager;

import com.example.entity.Application;
import com.example.repository.ApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApplicationManager {

    @Autowired
    private ApplicationRepository applicationRepository;

    public void saveApplication(Application application) {
        applicationRepository.save(application);
    }

    public List<Application> getApplicationsByUsername(String username) {
        return applicationRepository.findByUsername(username);
    }

    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }
    public Map<String, Integer> getApplicationStatusSummary(String username) {
        List<Application> applications = getApplicationsByUsername(username);
        Map<String, Integer> statusSummary = new HashMap<>();
        for (Application application : applications) {
            statusSummary.put(application.getStatus(),
                    statusSummary.getOrDefault(application.getStatus(), 0) + 1);
        }
        return statusSummary;
    }

}
