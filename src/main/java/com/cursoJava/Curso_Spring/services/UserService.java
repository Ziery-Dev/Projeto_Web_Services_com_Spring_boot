package com.cursoJava.Curso_Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoJava.Curso_Spring.entities.User;
import com.cursoJava.Curso_Spring.repositiries.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){ //retorna tudo
		return repository.findAll();
	}
	
	public User findById(Long id) { //retorna por id
		Optional <User> obj = repository.findById(id);
		return obj.get();	}
}
