package com.simplilearn.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.rest.entity.UserEntity;
import com.simplilearn.rest.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public UserEntity saveUser(UserEntity entity) {
		return repo.save(entity);
	}
	public List<UserEntity> getAllUsers(){
		return repo.findAll();
	}
	public UserEntity getUserById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
	}
	public UserEntity updateUser(UserEntity entity,int id) {
		if(repo.findById(id).isPresent()) {
			UserEntity old= repo.findById(id).get();
			old.setName(entity.getName());
			old.setEmail(entity.getEmail());
			old.setCountry(entity.getCountry());
			old.setPassword(entity.getPassword());
			
			return repo.save(old);
		}
		else
			return null;
	}
	
	public boolean deleteUser(int id) {
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		return false;
	}
	
}
