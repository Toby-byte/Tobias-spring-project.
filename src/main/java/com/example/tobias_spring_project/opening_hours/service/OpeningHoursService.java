package com.example.tobias_spring_project.opening_hours.service;


import com.example.tobias_spring_project.opening_hours.model.OpeningHours;
import com.example.tobias_spring_project.opening_hours.repository.OpeningHoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OpeningHoursService {


    private final OpeningHoursRepository repository;

    public List<OpeningHours> findAll() {
        return repository.findAll();
    }

    public OpeningHours findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("%d not found".formatted(id)));
    }

    public OpeningHours add(OpeningHours object){
        return repository.save(object);
    }

    public OpeningHours update(Long id, OpeningHours object, boolean partial){
        Optional<OpeningHours> temp =  repository.findById(id)
                .map(oldItem -> {
                    return repository.save(oldItem.updateFrom(object, partial));
                });
        return temp.orElseThrow(() -> new RuntimeException("%s %d not found".formatted(id)));
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
