package com.example.tobias_spring_project.news.repository;

import com.example.tobias_spring_project.news.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
