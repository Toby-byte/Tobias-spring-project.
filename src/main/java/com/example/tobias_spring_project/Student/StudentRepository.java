package com.example.tobias_spring_project.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This class is reponsible for data access
@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {
}
