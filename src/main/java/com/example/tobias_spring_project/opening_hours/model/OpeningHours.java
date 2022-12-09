package com.example.tobias_spring_project.opening_hours.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "OPENING_HOURS")
public class OpeningHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIELD_1")
    private String field1;

    @Column(name = "TIME_1")
    private String time1;

    @Column(name = "FIELD_2")
    private String field2;

    @Column(name = "TIME_2")
    private String time2;

    @Column(name = "FIELD_3")
    private String field3;

    @Column(name = "TIME_3")
    private String time3;

    public OpeningHours(String field1, String time1, String field2, String time2,
                        String field3, String time3) {
        this.field1 = field1;
        this.time1 = time1;
        this.field2 = field2;
        this.time2 = time2;
        this.field3 = field3;
        this.time3 = time3;
    }

    public OpeningHours updateFrom(OpeningHours object, boolean partial){
        if(!partial || object.field1!=null) {this.field1 = object.field1;}
        if(!partial || object.time1!=null) {this.time1 = object.time1;}
        if(!partial || object.field2!=null) {this.field2 = object.field2;}
        if(!partial || object.time2!=null) {this.time2 = object.time2;}
        if(!partial || object.field3!=null) {this.field3 = object.field3;}
        if(!partial || object.time3!=null) {this.time3 = object.time3;}
        return this;
    }
}
