package com.simplilearn.api1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.api1.entity.PersonEntity;
import com.simplilearn.api1.entity.Response;
import com.simplilearn.api1.service.PersonService;

@RestController
@RequestMapping("/api1/person")
public class MainController {

	@Autowired
	PersonService service;
	
	@PostMapping("")
	public ResponseEntity<Object> addPerson(@RequestBody PersonEntity person){
		PersonEntity obj= service.addPerson(person);
		if(obj!=null)
			return new ResponseEntity<Object>(obj,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while creating a user",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("")
	public List<PersonEntity> getAllPersons(){
		return service.getAll();
	}
	@GetMapping("/{personId}")
	public ResponseEntity<Object> getPersonWithHobby(@PathVariable int personId){
		Response obj= service.getPersonWithHobby(personId);
		if(obj!=null)
			return new ResponseEntity<Object>(service.getPersonWithHobby(personId),
				HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("No user available",HttpStatus.NOT_FOUND);
	}
}
