


package com.example.accessingdatamongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;
import java.util.*;
import java.io.*;

public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public int age;
	public Date dateOfBirth;
	//public Date dateofjoing;
	String date = "June 11, 2018";
	
	
	public Customer() {}

	public Customer(String firstName, String lastName, Date DOB, int Age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age= Age;
		this.dateOfBirth= DOB;
		//this.dateofjoing= DOJ;
		
	}

	@Override
	public String toString() {
		/*
		 * return String.format(
		 * "Customer[id=%s, firstName='%s', lastName='%s',dob='%s',Age='%s',doj='%s']",
		 * id, firstName, lastName,dateOfBirth,age );
		 */
		return "";
	}

}
 