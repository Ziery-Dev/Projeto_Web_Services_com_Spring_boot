package com.cursoJava.Curso_Spring.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso_Spring.entities.User;

//Responsável por fazer operações com a classe User
public interface UserRepository extends JpaRepository<User, Long>{ //<User, Long> = tipo da entidade e tipo do Id

}
