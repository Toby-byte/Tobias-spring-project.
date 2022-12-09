package com.example.tobias_spring_project.news.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "NEWS")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "DATE")
    private String date;

    public News(String title, String text, String date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public News updateFrom(News object, boolean partial){
        if(!partial || object.title!=null) {this.title = object.title;}
        if(!partial || object.text!=null) {this.text = object.text;}
        if(!partial || object.date!=null) {this.date = object.date;}
        return this;
    }
}
