package com.example.repository;

import com.example.entity.Application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    List<Application> findByUsername(String username);
    List<Application> findAll();
    Application findByAppid(int appid);

}
