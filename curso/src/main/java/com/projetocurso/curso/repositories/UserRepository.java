package com.projetocurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.curso.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{
	
	

}
