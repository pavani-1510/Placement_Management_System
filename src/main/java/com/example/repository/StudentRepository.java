package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    
//	@Query("SELECT s FROM Student s WHERE s.username = :username AND s.password = :password")
//	Student findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    Student findByUsernameAndPassword(String username, String password);

}
