package com.example.models;

// Imports ...

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface FileDao extends JpaRepository<File, Long> {

    /**
     * This method will find an File instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public File findByName(String name);

}