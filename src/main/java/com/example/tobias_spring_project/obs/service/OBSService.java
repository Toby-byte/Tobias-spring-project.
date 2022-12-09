package com.example.tobias_spring_project.obs.service;


import com.example.tobias_spring_project.obs.model.OBS;
import com.example.tobias_spring_project.obs.repository.OBSRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OBSService {

    private final OBSRepository repository;

    public List<OBS> findAll() {
        return repository.findAll();
    }

    public OBS findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("%d not found".formatted(id)));
    }

    public OBS add(OBS object){
        return repository.save(object);
    }

    public OBS update(Long id, OBS object, boolean partial){
        Optional<OBS> temp =  repository.findById(id)
                .map(oldItem -> {
                    return repository.save(oldItem.updateFrom(object, partial));
                });
        return temp.orElseThrow(() -> new RuntimeException("%s %d not found".formatted(id)));
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
