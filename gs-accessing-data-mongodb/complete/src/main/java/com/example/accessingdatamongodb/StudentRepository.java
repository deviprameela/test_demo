package com.example.accessingdatamongodb;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

	public Student findByName(String name);
	//public List<Student> findByLastName(String lastName);
}
