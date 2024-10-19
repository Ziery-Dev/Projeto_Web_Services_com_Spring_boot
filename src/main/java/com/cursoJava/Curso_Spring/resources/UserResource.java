package com.cursoJava.Curso_Spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoJava.Curso_Spring.entities.User;
import com.cursoJava.Curso_Spring.services.UserService;

@RestController //para falar que a classe é um recurso web que é implementado por um controlador Rest
@RequestMapping(value="/users")//Nome do recurso
public class UserResource {

	@Autowired
	private UserService service;
	
	//método end point para acessar os usuários
	@GetMapping//para indicar que o método responde a requisição do tipo get do http
	public ResponseEntity<List<User>> findAll(){ //retorna os usuários
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	//Essa classe é um controlador Rest que responde no caminho "/users"
}
