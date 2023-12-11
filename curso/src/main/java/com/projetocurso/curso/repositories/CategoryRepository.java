package com.projetocurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.curso.entities.Category;


public interface  CategoryRepository extends JpaRepository<Category, Long>{
	
	

}

