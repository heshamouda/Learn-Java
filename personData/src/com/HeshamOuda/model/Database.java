package com.HeshamOuda.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<Person> personData;

	public Database() {
		super();
		this.personData = new ArrayList<>();
	}

	public void addPerson(Person person) {
		this.personData.add(person);
	}

	public void removeerson(Person person) {
		this.personData.remove(person);
	}

	public List<Person> getPersonData() {
		return this.personData;
	}
}
