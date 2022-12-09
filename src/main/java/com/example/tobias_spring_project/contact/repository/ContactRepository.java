package com.example.tobias_spring_project.contact.repository;

import com.example.tobias_spring_project.contact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
