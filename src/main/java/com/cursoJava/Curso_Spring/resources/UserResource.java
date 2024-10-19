package com.cursoJava.Curso_Spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoJava.Curso_Spring.entities.User;

@RestController //para falar que a classe é um recurso web que é implementado por um controlador Rest
@RequestMapping(value="/users")//Nome do recurso
public class UserResource {

	
	
	//método end point para acessar os usuários
	@GetMapping//para indicar que o método responde a requisição do tipo get do http
	public ResponseEntity<User> findAll(){ //retorna os usuários
		User u = new User(1L, "Ziery", "ziery@gmail.com", "98991368347", "1234"); //apenas para critério de testes
		return ResponseEntity.ok().body(u);
	}
	
	
	//Essa classe é um controlador Rest que responde no caminho "/users"
}
