package com.projetocurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.curso.entities.Order;


public interface  OrderRepository extends JpaRepository<Order, Long>{
	
	

}
