package com.devsuperior.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
//rota REST (requisições web) do recurso
public class CategoryResource {
	/**
	 * Recebe requisições da API(a API ajudará a comunicar o que você quer ao sistema 
	 * para que ele entenda e realize o que foi solicitado).Pense nas APIs como um mediador 
	 * entre os usuários ou clientes e os recursos ou serviços web que eles querem obter.
	 */
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Eletronics"));
		return ResponseEntity.ok().body(list);
	}
	
}
