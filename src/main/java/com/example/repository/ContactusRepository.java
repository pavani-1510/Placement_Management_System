package com.example.repository;

import com.example.entity.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactusRepository extends JpaRepository<ContactUs, Long> {
    // Custom queries can be added here if needed
}
