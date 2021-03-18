package com.example.accessingdatamongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;


public class Employee {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public int age;
	public Date dob;
	public Date doj;

	public Employee() {}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	@Override
	public String toString() {
		return String.format(
				"Employee[id=%s, firstName='%s', lastName='%s', dob='%s', age='%s',doj='%']",
				id, firstName, lastName, dob, age, doj);
	}

}

