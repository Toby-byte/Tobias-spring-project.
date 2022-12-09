package com.example.tobias_spring_project.Prices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Skrevet af Tobias
@Repository
public interface PriceRepository extends JpaRepository<Price,Long> {
}
