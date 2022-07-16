package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@GetMapping("/users")
	public ResponseEntity<Object[]> getAllUsers(){
		
		RestTemplate template= new RestTemplate();
		UserModel users[]=template.getForObject("https://jsonplaceholder.typicode.com/users", UserModel[].class);
		return new ResponseEntity<Object[]>(users,HttpStatus.OK);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<UserModel> getUserById(@PathVariable int id){
		
		RestTemplate template= new RestTemplate();
		UserModel user=template.getForObject("https://jsonplaceholder.typicode.com/users/"+id, UserModel.class);
		return new ResponseEntity<UserModel>(user,HttpStatus.OK);
	}
}
