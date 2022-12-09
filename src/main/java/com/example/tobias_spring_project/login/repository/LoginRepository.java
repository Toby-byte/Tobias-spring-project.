package com.example.tobias_spring_project.login.repository;

import com.example.tobias_spring_project.login.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface LoginRepository extends JpaRepository<Login, Long> {
}
