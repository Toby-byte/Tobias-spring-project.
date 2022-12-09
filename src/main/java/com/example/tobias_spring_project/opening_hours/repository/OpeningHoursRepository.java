package com.example.tobias_spring_project.opening_hours.repository;

import com.example.tobias_spring_project.opening_hours.model.OpeningHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpeningHoursRepository extends JpaRepository<OpeningHours, Long> {
}
