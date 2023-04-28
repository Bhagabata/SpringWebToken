package com.example.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpringBoot.bean.Tutorial;
import com.example.demoSpringBoot.service.TutorialServices;

@RestController
public class TutorialConroller {
	@Autowired
	TutorialServices tutoo;
	@GetMapping("/getList")
	public List<Tutorial>get(){
		return tutoo.get();
	}
	@GetMapping("/getList/{id}")
	public Tutorial getById(@PathVariable int id) {
		return tutoo.getById(id);
	}
	@PostMapping("/postList")
	public Tutorial create(@RequestBody Tutorial tuto) {
		return tutoo.add(tuto);
	}
	@PutMapping("/updateList")
	public Tutorial update(@RequestBody Tutorial tuto) {
		return tutoo.update(tuto);
	}
	@DeleteMapping("/deleteList/{id}")
	public String delete( @PathVariable int id) {
		tutoo.delete(id);
		return id+" deleted successfully";
	}
}
