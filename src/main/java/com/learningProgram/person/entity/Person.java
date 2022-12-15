package com.learningProgram.person.entity;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	@Id
	Long aadharId;
	String voterId;
	int age;
	Long phoneNumber;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Long getAadharId() {
		return aadharId;
	}

	public void setAadharId(Long aadharId) {
		this.aadharId = aadharId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
