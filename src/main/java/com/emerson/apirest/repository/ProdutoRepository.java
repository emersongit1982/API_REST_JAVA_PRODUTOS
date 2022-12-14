package com.emerson.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findByid(long id);
	

}
