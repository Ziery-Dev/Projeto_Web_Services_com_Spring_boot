package com.cursoJava.Curso_Spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoJava.Curso_Spring.entities.User;
import com.cursoJava.Curso_Spring.repositiries.UserRepository;

@Configuration//avisa pro spring que essa é uma classe especifica de configuração
@Profile("test") //avisa que essa classe é uma configuração para o perfil de teste
public class TestConfig implements CommandLineRunner {
	
	@Autowired //para que o spring associe uma instancia do use repository no testconfig
	private UserRepository  useRepository;

	@Override
	public void run(String... args) throws Exception { //tudo aqui será executado ao iniciar a aplicação
		User u1 = new User(null, "Ziery Reis", "zieryreis@gmail.com", "985555555", "12345");
		User u2 = new User(null, "Anthony Calleb", "tony@gmail.com", "98554445555", "1252345");
		
		//salvando no banco de dados
		useRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
