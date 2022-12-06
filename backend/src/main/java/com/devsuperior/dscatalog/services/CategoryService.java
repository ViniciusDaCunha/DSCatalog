package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
/**
 * Camada responsável por fazer a chamada de alguma funcionalidade da camada de acesso de dados
 */
public class CategoryService {
	
	@Autowired
	//injeta dependencia com a camada repository(acesso a dados)
	private CategoryRepository repository;
	
	@Transactional(readOnly = true) 
	public List<Category> findAll(){
		return repository.findAll();
	}

}
