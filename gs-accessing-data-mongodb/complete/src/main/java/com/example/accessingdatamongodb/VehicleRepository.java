package com.example.accessingdatamongodb;

import org.springframework.data.mongodb.repository.MongoRepository;


//public class VehicleRepository {
	
	public interface VehicleRepository extends MongoRepository<Vehicle, String> {

		public Vehicle findByName(String name);
		//public List<Student> findByLastName(String lastName);

		public void save(Student student);

	
	}



