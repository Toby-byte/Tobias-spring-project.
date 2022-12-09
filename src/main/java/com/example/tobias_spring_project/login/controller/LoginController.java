package com.example.tobias_spring_project.login.controller;

import com.example.tobias_spring_project.login.model.Login;
import com.example.tobias_spring_project.login.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
//
@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/login")
public class LoginController {
    private final LoginService service;

    @GetMapping("/{id}")
    public Login findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/update-login")
    public Login put(Long id, @Valid @RequestBody Login object){
        return service.update(id,object, false);
    }
}
