package com.example.tobias_spring_project.contact.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    public Contact(String phoneNumber, String email, String address){
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Contact updateFrom(Contact object, boolean partial){
        if(!partial || object.phoneNumber!=null) {this.phoneNumber = object.phoneNumber;}
        if(!partial || object.email!=null) {this.email = object.email;}
        if(!partial || object.address!=null) {this.address = object.address;}
        return this;
    }

}
