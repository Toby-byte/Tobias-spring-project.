package com.example.tobias_spring_project.obs.controller;

import com.example.tobias_spring_project.obs.model.OBS;
import com.example.tobias_spring_project.obs.service.OBSService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/obs")
public class OBSController {

    private final OBSService service;

    @GetMapping
    public List<OBS> findAll() {
        List<OBS> objects = service.findAll();
        return objects;
    }

    @PostMapping
    public OBS add(@Valid @RequestBody OBS object) {
        return service.add(object);
    }

    @GetMapping("/{id}")
    public OBS findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public OBS delete(@PathVariable("id") Long id) {
        OBS result = service.findById(id);
        service.delete(id);
        return result;
    }

    @PutMapping("/{id}")
    public OBS put (@PathVariable("id") Long id, @Valid @RequestBody OBS object){
        return service.update(id, object, false);
    }


    @PatchMapping("/{id}")
    public OBS patch(@PathVariable("id") Long id, @Valid @RequestBody OBS object){
        return service.update(id, object, true);
    }


    private OBS update(Long id, OBS object, boolean partial){
        return service.update(id, object, partial);
    }
}
