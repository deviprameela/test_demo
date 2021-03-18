package com.example.accessingdatamongodb;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.util.*;


@SpringBootApplication
public class AccessingDataMongodbMainApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private StudentRepository stuRepo;
	
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private VehicleRepository vehRepo;
	
	
	public static void main(String[] args) {
	
	
		SpringApplication.run(AccessingDataMongodbMainApplication.class, args);
	

	}
	
	

	@Override
	public void run(String... args) throws Exception {

		custRepo.deleteAll();

		// save a couple of customers
		
		custRepo.save(new Customer("Alice", "Smith",new Date("10/10/1980"), getAge("10/10/1980")));
		custRepo.save(new Customer("Bob", "Smith",new Date("10/10/1985"), getAge("10/10/1985")));
		custRepo.save(new  Customer("John", "Smith",new Date("10/10/1987"), getAge("10/10/1987")));
		

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : custRepo.findAll()) {
			System.out.println(customer);
		
		
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(custRepo.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("------------z-------------------");
		//String totalmarks;
		for (Customer customer : custRepo.findByLastName("Smith")) {
			System.out.println(customer);

		}
		
		// delete all the existing records
		stuRepo.deleteAll();
		
			
		stuRepo.save(new Student("Ram", 50,60,60,60));
		stuRepo.save(new Student("Sam", 50,60,70,80));
		stuRepo.save(new Student("Ali", 50,50,50,50));
		stuRepo.save(new Student("Ali", 60,55,65,65));
	
		// fetch all students
		System.out.println("Students  found with findAll():");
		System.out.println("-------------------------------");
		for (Student student : stuRepo.findAll()) {
			System.out.println(student);
	
		}
		
		
		
		
		
		
		// delete all the existing records
		vehRepo.deleteAll();
				
		//(String name,  int wheels, int seats,int doors, int Steering)
					
				vehRepo.save(new Vehicle("BMW", 4,4,4,1));
				vehRepo.save(new Vehicle("SKODA", 4,4,4,1));
				vehRepo.save(new Vehicle("HONDA", 4,4,4,1));
				vehRepo.save(new Vehicle("SUV", 4,4,4,1));
			
				// fetch all students
				System.out.println("Vehicle found with findAll():");
				System.out.println("-------------------------------");
				for (Vehicle vehicle : vehRepo.findAll()) {
					System.out.println(vehicle);
			
				}
			
				}

	public static int getAge(String dob) throws ParseException {
		//Converting String to Date
	      SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	      Date date = formatter.parse(dob);
	      //Converting obtained Date object to LocalDate object
	      Instant instant = date.toInstant();
	      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
	      LocalDate givenDate = zone.toLocalDate();
	      //Calculating the difference between given date to current date.
	      Period period = Period.between(givenDate, LocalDate.now());
	      System.out.print(period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days");
	      return period.getYears();
	}
   

}
   
