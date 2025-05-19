package com.example.repository;

import com.example.entity.Jobs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String> {
    List<Jobs> findAll(); // This will return all jobs in the database

}
