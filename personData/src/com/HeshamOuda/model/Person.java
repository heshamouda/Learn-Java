package com.HeshamOuda.model;

public class Person {
	private String name;
	private String occupation;

	/**
	 * @param name
	 * @param occupation
	 */
	public Person(String name, String occupation) {
		super();
		this.name = name;
		this.occupation = occupation;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
