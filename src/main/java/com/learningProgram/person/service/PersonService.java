package com.learningProgram.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningProgram.person.entity.Person;
import com.learningProgram.person.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository; 
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public Person getPerson(Long aadharId) {
		return personRepository.getPerson(aadharId);
	}
	public String deletePerson(Long aadharId) {
		return personRepository.deletePerson(aadharId);
	}

	public String checkEligibilityVoting(Long aadharId) {
		return personRepository.checkEligibilityVoting(aadharId);
	}

	
}
