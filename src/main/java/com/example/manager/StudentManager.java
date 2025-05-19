package com.example.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@Service
public class StudentManager {

    @Autowired
    private static StudentRepository studentRepository;

    public String insertData(Student s1) {
        studentRepository.save(s1);
        return "Insertion done successfully";
    }

    public String updateData(Student s1) {
        if (studentRepository.existsById(s1.getUsername())) {
            studentRepository.save(s1); // save() works for both insert and update
            return "Updation done successfully";
        }
        return "Student not found";
    }

    public String deleteData(String username) {
        if (studentRepository.existsById(username)) {
            studentRepository.deleteById(username);
            return "Deletion done successfully";
        }
        return "Student not found";
    }

    public List<Student> retrieveData() {
        return studentRepository.findAll();
    }
    
    

    public ResponseEntity<?> validateLogin(String username, String password) {
        System.out.println("Received username: " + username); // Debugging log
        System.out.println("Received password: " + password); // Debugging log
        
        Student student = studentRepository.findByUsernameAndPassword(username, password);

        if (student != null) {
            return ResponseEntity.ok().body("{\"success\": true}");
        } else {
            return ResponseEntity.status(401).body("{\"success\": false}");
        }
    }



//    public void validateUser(String username, String password, HttpServletResponse response) throws IOException {
//        // Check if the user exists with the given credentials
//        Student student = studentRepository.findByUsernameAndPassword(username, password);
//
//        if (student != null) {
//            // If credentials are valid, redirect to dashboard
//            response.sendRedirect("/dashboard.html");
//        } else {
//            // If credentials are invalid, redirect back to login page
//            response.sendRedirect("/login.html");
//        }
//    }
    public boolean validateUser(String username, String password) {
        // Fetch user from the repository by username and password
        Student student = studentRepository.findByUsernameAndPassword(username, password);
        return student != null;  // Returns true if user is found, false otherwise
    }
}
