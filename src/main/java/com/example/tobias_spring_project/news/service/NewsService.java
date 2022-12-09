package com.example.tobias_spring_project.news.service;

import com.example.tobias_spring_project.news.model.News;
import com.example.tobias_spring_project.news.repository.NewsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class NewsService {

    private final NewsRepository repository;

    public List<News> findAll() {
        return repository.findAll();
    }

    public News findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("%d not found".formatted(id)));
    }

    public News add(News object){
        return repository.save(object);
    }

    public News update(Long id, News object, boolean partial){
        Optional<News> temp =  repository.findById(id)
                .map(oldItem -> {
                    return repository.save(oldItem.updateFrom(object, partial));
                });
        return temp.orElseThrow(() -> new RuntimeException("%s %d not found".formatted(id)));
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
