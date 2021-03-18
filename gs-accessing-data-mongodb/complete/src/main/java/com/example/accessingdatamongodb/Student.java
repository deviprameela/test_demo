package com.example.accessingdatamongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Student {

	@Id
	public String id;

	public String name;
	public int Engmarks;
	public int Scimarks;
	public int Socmarks;
	public int Artmarks;

	public float totalmarks;
	public float average;
	public float percentage;

	public Student() {
	}

	public Student(String SName,  int Engmarks, int Artmarks,
			int Socmarks, int Scimarks)
			{

		this.name = SName;
		this.Engmarks = Engmarks;
		this.Scimarks = Scimarks;
		this.Socmarks = Socmarks;
		this.Artmarks = Artmarks;

		
		//Calculate total, average and percentage

	    totalmarks = Engmarks + Scimarks + Socmarks + Artmarks ;
	    
	     average = (totalmarks / 4);
	     percentage = (totalmarks / 400) * 100;

	     
    
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Engmarks=" + Engmarks + ", Scimarks=" + Scimarks
				+ ", Socmarks=" + Socmarks + ", Artmarks=" + Artmarks + ", totalmarks=" + totalmarks + ", average="
				+ average + ", percentage=" + percentage + "]";
	}

	
	

}