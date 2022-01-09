package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Choices;

@Repository 
public interface ChoicesRepository extends JpaRepository<Choices,Integer> {

}
