package com.example.tobias_spring_project.obs.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "OBS")
public class OBS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "DATE")
    private String date;

    public OBS(String text, String date){
        this.text = text;
        this.date = date;
    }

    public OBS updateFrom(OBS object, boolean partial){
        if(!partial || object.text!=null) {this.text = object.text;}
        if(!partial || object.date!=null) {this.date = object.date;}
        return this;
    }
}
