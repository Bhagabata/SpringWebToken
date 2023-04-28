package com.example.demoSpringBoot.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpringBoot.Bean.Passport;

public interface Passport_JPA extends JpaRepository<Passport, Integer> {

}
