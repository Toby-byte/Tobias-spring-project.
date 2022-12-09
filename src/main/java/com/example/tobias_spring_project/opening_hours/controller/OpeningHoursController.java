package com.example.tobias_spring_project.opening_hours.controller;


import com.example.tobias_spring_project.opening_hours.model.OpeningHours;
import com.example.tobias_spring_project.opening_hours.service.OpeningHoursService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/openinghours")
public class OpeningHoursController {

    private final OpeningHoursService service;

    @GetMapping
    public List<OpeningHours> findAll() {
        List<OpeningHours> objects = service.findAll();
        return objects;
    }

    @PostMapping
    public OpeningHours add(@Valid @RequestBody OpeningHours object) {
        return service.add(object);
    }

    @GetMapping("/{id}")
    public OpeningHours findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public OpeningHours delete(@PathVariable("id") Long id) {
        OpeningHours result = service.findById(id);
        service.delete(id);
        return result;
    }

    @PutMapping("/{id}")
    public OpeningHours put (@PathVariable("id") Long id, @Valid @RequestBody OpeningHours object){
        return service.update(id, object, false);
    }


    @PatchMapping("/{id}")
    public OpeningHours patch(@PathVariable("id") Long id, @Valid @RequestBody OpeningHours object){
        return service.update(id, object, true);
    }


    private OpeningHours update(Long id, OpeningHours object, boolean partial){
        return service.update(id, object, partial);
    }
}
