package com.projetocurso.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetocurso.curso.entities.User;

@RestController // implementar o controlador rest
@RequestMapping(value = "/users") // preciso dar um nome ao meu recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){ //ResponseEntity - retorna resposta de 
		//requisições web
		User u = new User(1L, "Felipe", "felip@gmail.com", "123", "123456");
		return ResponseEntity.ok().body(u);
	}

}
