package com.example.entity;

import java.io.Serializable;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jobs implements Serializable {
	@Id
    String sid;
    String sname;
    private String position;
    private String department;
    private String location;
    private double salary;
    private Date datePosted;
    private String jobType;
    private int experienceRequired;
    private String skills;
    private String jobDescription;
    private String companyName;
    private String contactEmail;

    // Constructors
    public Jobs() {
    }

    public Jobs(String sid, String sname, String position, String department, String location, double salary,
                Date datePosted, String jobType, int experienceRequired, String skills,
                String jobDescription, String companyName, String contactEmail) {
        this.sid = sid;
        this.sname = sname;
        this.position = position;
        this.department = department;
        this.location = location;
        this.salary = salary;
        this.datePosted = datePosted;
        this.jobType = jobType;
        this.experienceRequired = experienceRequired;
        this.skills = skills;
        this.jobDescription = jobDescription;
        this.companyName = companyName;
        this.contactEmail = contactEmail;
    }

    // Getters and Setters
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getExperienceRequired() {
        return experienceRequired;
    }

    public void setExperienceRequired(int experienceRequired) {
        this.experienceRequired = experienceRequired;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Jobs [sid=" + sid + ", sname=" + sname + ", position=" + position + ", department=" + department
                + ", location=" + location + ", salary=" + salary + ", datePosted=" + datePosted + ", jobType=" + jobType
                + ", experienceRequired=" + experienceRequired + ", skills=" + skills + ", jobDescription=" + jobDescription
                + ", companyName=" + companyName + ", contactEmail=" + contactEmail + "]";
    }
}
