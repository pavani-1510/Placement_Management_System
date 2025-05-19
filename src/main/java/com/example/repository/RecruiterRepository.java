package com.example.repository;

import com.example.entity.Application;
import com.example.entity.Recruiter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, String> {
    // You can define custom queries here if needed, for example:
    Recruiter findByRecId(Long recId);
    Recruiter existsByRecIdAndPassword(Long recId, String password);
    Recruiter findByEmailAndPassword(String email, String password);
    List<Recruiter> findAll();
}
