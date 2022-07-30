package com.simplilearn.api2.controller;

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

import com.simplilearn.api2.entity.HobbyEntity;
import com.simplilearn.api2.service.HobbyService;

@RestController
@RequestMapping("/api2/hobby")
public class HobbyController {

	@Autowired
	HobbyService service;
	@PostMapping("")
	public ResponseEntity<Object> addHobby(@RequestBody HobbyEntity hobby){
		HobbyEntity obj= service.addHobby(hobby);
		if(obj!=null)
			return new ResponseEntity<Object>(obj,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting records",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("")
	public List<HobbyEntity> getAll(){
		return service.getAll();
	}
	@GetMapping("/{personId}")
	public ResponseEntity<String> findHobby(@PathVariable int personId){
		String data= service.getHobbyByPersonId(personId);
		if(data!=null)
			return new ResponseEntity<String>(data,HttpStatus.FOUND);
		else
			return new ResponseEntity<String>("No hobby Available",HttpStatus.NOT_FOUND);
	}
}
