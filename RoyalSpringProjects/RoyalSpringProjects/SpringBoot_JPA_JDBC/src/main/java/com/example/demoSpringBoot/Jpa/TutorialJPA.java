package com.example.demoSpringBoot.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpringBoot.bean.Tutorial;

public interface TutorialJPA extends JpaRepository<Tutorial, Integer> {

}
