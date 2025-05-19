package com.example.manager;

import com.example.entity.Application;

import com.example.entity.Recruiter;
import com.example.repository.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterManager {


    // Insert data
    public String insertData(Recruiter r1) {
        recruiterRepository.save(r1); // Spring Data JPA automatically persists the entity
        return "Insertion done successfully";
    }
    public List<Recruiter> getRecruiters() {
        return recruiterRepository.findAll();
    }

//    // Update data
//    public String updateData(Recruiter r1) {
//        Optional<Recruiter> recruiterOptional = recruiterRepository.findById(r1.getRecId());
//        if (recruiterOptional.isPresent()) {
//            Recruiter r2 = recruiterOptional.get();
//            r2.setName(r1.getName());
//            r2.setEmail(r1.getEmail());
//            r2.setCompany(r1.getCompany());
//            r2.setPassword(r1.getPassword());
//            recruiterRepository.save(r2); // This will update the recruiter
//            return "Updation done successfully";
//        } else {
//            return "Recruiter not found";
//        }
//    }

//    // Delete data
//    public String deleteData(Recruiter r1) {
//        Optional<Recruiter> recruiterOptional = recruiterRepository.findById(r1.getRecid());
//        if (recruiterOptional.isPresent()) {
//            recruiterRepository.delete(r1); // Spring Data JPA handles the removal
//            return "Deletion done successfully";
//        } else {
//            return "Recruiter not found";
//        }
//    }

    // Retrieve data
    public List<Recruiter> retrieveData() {
        return recruiterRepository.findAll(); // Retrieves all recruiters
    }
//
//    // Validate user
//    public boolean validateUser(String recid, String password) {
//        return recruiterRepository.existsByRecidAndPassword(recid, password); // Custom query method in the repository
//    }


    @Autowired
    private RecruiterRepository recruiterRepository;
    public void addRecruiter(Recruiter recruiter) {
        recruiterRepository.save(recruiter);
    }


}
