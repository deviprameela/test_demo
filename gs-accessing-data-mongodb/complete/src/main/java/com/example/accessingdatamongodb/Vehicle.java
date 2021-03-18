package com.example.accessingdatamongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Vehicle {

	@Id
	public String id;

	public String name;
	public int Wheels;
	public int Seats;
	public int Doors;
	public int Steering;

	
	public Vehicle() {
	}

	public Vehicle (String name,  int wheels, int seats,
			int doors, int Steering)
			{

		this.name = name;
		this.Wheels= wheels;
		this.Seats = seats;
		this.Doors = doors;
		this.Steering = Steering;

	
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", Wheels=" + Wheels + ", Seats=" + Seats + ", Doors=" + Doors
				+ ", Steering=" + Steering + "]";
	}

}



