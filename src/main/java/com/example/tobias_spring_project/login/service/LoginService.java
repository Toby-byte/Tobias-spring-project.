package com.example.tobias_spring_project.login.service;

import com.example.tobias_spring_project.login.model.Login;
import com.example.tobias_spring_project.login.repository.LoginRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
//
@AllArgsConstructor
@Service
public class LoginService {
    private final LoginRepository repository;

    public Login findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("%d not found".formatted(id)));
    }

    public Login update(Long id, Login object, boolean partial){
            Optional<Login> temp =  repository.findById(id)
                .map(oldItem -> repository.save(oldItem.updateFrom(object, partial)));
        return temp.orElseThrow(() -> new RuntimeException("%s %d not found".formatted(object.getUsername())));
    }

}
