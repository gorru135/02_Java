package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private int prisonerCount;
	private Prisoner[] ps = new Prisoner[prisonerCount];
	
	
	public Prison(int size) {}
	
	public void addPerson(Person person) {}
	
	public void removePerson(String id) {}
	
	public void displayAllPersons() {}
}
