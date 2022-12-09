package com.example.tobias_spring_project.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    /*@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tobias = new Student(
                    "Tobias",
                    "@gmail",
                    LocalDate.of(1997, DECEMBER, 9),24);

            Student allan = new Student(
                    "Allan",
                    "hot@gmail",
                    LocalDate.of(1999, NOVEMBER, 18),23);

                    repository.saveAll(
                            List.of(tobias,allan)
                    );
        };
    }*/
}
