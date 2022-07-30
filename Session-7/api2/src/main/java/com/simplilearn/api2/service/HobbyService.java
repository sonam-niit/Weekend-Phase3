package com.simplilearn.api2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.api2.entity.HobbyEntity;
import com.simplilearn.api2.repo.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	HobbyRepository repo;
	
	public HobbyEntity addHobby(HobbyEntity entity) {
		return repo.save(entity);
	}
	public List<HobbyEntity> getAll(){
		return repo.findAll();
	}
	public String getHobbyByPersonId(int personId) {
		return repo.findHobbyByPersonId(personId);
	}
}
