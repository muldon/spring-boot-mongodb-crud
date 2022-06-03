package com.spring.mongo.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.mongo.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findByFirstName(String firstName);

    List<Employee> findByFirstNameLike(String firstName);

    @Query("{firstName:'?0'}")
	List<Employee> findEmployeesByName(String name);


}
