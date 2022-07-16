package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public ResponseEntity<Object> getResult(){
		return new ResponseEntity<Object>("Request Responded",HttpStatus.OK);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> getUser(){
		User u= new User(1, "Sonam Soni");
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable("id") int id) throws ProductNotFoundException{
		if(id==0)
			throw new ProductNotFoundException("No valid id");
		else
			return new ResponseEntity<Object>("Product Found",HttpStatus.FOUND);
	}
	
	
}
