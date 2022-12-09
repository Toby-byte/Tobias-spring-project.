package com.example.tobias_spring_project;

import com.example.tobias_spring_project.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class TobiasSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TobiasSpringProjectApplication.class, args);
    }

}
