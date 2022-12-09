package com.example.tobias_spring_project.news.controller;

import com.example.tobias_spring_project.news.model.News;
import com.example.tobias_spring_project.news.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/news")
public class NewsController {

    private final NewsService service;

    @GetMapping
    public List<News> findAll() {
        List<News> objects = service.findAll();
        return objects;
    }

    @PostMapping
    public News add(@Valid @RequestBody News object) {
        return service.add(object);
    }

    @GetMapping("/{id}")
    public News findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public News delete(@PathVariable("id") Long id) {
        News result = service.findById(id);
        service.delete(id);
        return result;
    }

    @PutMapping("/{id}")
    public News put (@PathVariable("id") Long id, @Valid @RequestBody News object){
        return service.update(id, object, false);
    }


    @PatchMapping("/{id}")
    public News patch(@PathVariable("id") Long id, @Valid @RequestBody News object){
        return service.update(id, object, true);
    }


    private News update(Long id, News object, boolean partial){
        return service.update(id, object, partial);
    }
}
