package com.learningProgram.person.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningProgram.person.entity.Person;
import com.learningProgram.person.service.PersonService;

@RestController
@RequestMapping("/person")  // base path
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("/save")   // restfull web services
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	@GetMapping("/get")
	public Person getPerson(@RequestParam Long aadharId) {
		return personService.getPerson(aadharId);
	}
	@DeleteMapping("/delete")
	public String deletePerson(@RequestParam Long aadharId){
		return personService.deletePerson(aadharId); 
	}
	@GetMapping("/check")
	public String checkEligibilityVoting(@RequestParam Long aadharId) {
		return personService.checkEligibilityVoting(aadharId);
	}
}
