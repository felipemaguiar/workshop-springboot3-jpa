package com.projetocurso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.curso.entities.OrderItem;


public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
