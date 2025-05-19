package com.example.entity;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "application") // Optional: specify the table name if different
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int appid;
    private String username; 
    private String sid;
    private String fullName;
    private String mobileNumber;
    private String emailId;
    private String gender;
    private String resume;
    private double cgpa;
    private String status;

    // Constructors
    public Application() {
    }

    public Application(String username, String sid, String fullName, String mobileNumber, String emailId, 
                       String gender, String resume, double cgpa, String status) {
        this.username = username;
        this.sid = sid;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.gender = gender;
        this.resume = resume;
        this.cgpa = cgpa;
        this.status = status;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Application [username=" + username + ", sid=" + sid + ", fullName=" + fullName + ", mobileNumber=" 
               + mobileNumber + ", emailId=" + emailId + ", gender=" + gender + ", resume=" + resume + ", cgpa=" + cgpa 
               + ", status=" + status + "]";
    }
}
