package com.learningProgram.person.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningProgram.person.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	default public Person savePerson(Person person) {
		return save(person);
	}
	
	default public Person getPerson(Long aadharId) {
		return findById(aadharId).get();
	}
	default public String deletePerson(Long aadharId) {
		String response = null;
		try {
			deleteById(aadharId);
			response = "Person record with Id: " + aadharId + " deleted successfully";
		} catch(Exception ex) {
			ex.printStackTrace();
			response = "Error in deleting, person is not deleted";
		}
		return response;
	}
 
	default public String checkEligibilityVoting(Long aadharId) {
		String response = null;
		// read the data from database
		Person person = findById(aadharId).get();
		if (person.getAge() >= 18) {
			response = "Person with aadharId: " + person.getAadharId() + " and Name: " + person.getName()
					+" is eligible for voting";
		} else {
			response = "Person with aadharId: " + person.getAadharId() + " and Name: " + person.getName()
					+ " is not eligible for voting";
		}
		return response;

	}

	
}
