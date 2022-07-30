package com.simplilearn.api1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.api1.entity.PersonEntity;
import com.simplilearn.api1.entity.Response;
import com.simplilearn.api1.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	RestTemplate template= new RestTemplate();
	public PersonEntity addPerson(PersonEntity entity) {
		return repo.save(entity);
	}
	public List<PersonEntity> getAll(){
		return repo.findAll();
	}
	public Response getPersonWithHobby(int personId) {
		
		final String url="http://localhost:8082/api2/hobby/{personId}";
		Map<String, Integer> map =new HashMap<String, Integer>();
		map.put("personId",personId);
		String hobby= template.getForObject(url, String.class,map);
		
		if(repo.findById(personId).isPresent()) 
		{
			PersonEntity entity= repo.findById(personId).get();
			Response resp= new Response();
			resp.setEntity(entity);
			resp.setHobby(hobby);
			
			return resp;
		}
		else return null;
	}
}
