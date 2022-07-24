package com.simplilearn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.rest.entity.UserEntity;
import com.simplilearn.rest.service.UserService;

@RestController
@RequestMapping("/UserLogService")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<Object> addUser(@RequestBody UserEntity entity){
		UserEntity resp=service.saveUser(entity);
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting a data",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/users")
	public List<UserEntity> getAllUsers(){
		return service.getAllUsers();
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable int id){
		UserEntity obj= service.getUserById(id);
		if(obj!=null)
			return new ResponseEntity<Object>(obj,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("No user available with this id",
					HttpStatus.NOT_FOUND);
					
	}
	@PutMapping("/users/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody UserEntity entity,
			@PathVariable int id){
		UserEntity obj= service.updateUser(entity, id);
		if(obj!=null)
			return new ResponseEntity<Object>(obj,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No user available for update",
					HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable int id){
		if(service.deleteUser(id))
			return new ResponseEntity<Object>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No user found to delete",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/hello")
	public String myMethod() {
		return "Hello";
	}
}









