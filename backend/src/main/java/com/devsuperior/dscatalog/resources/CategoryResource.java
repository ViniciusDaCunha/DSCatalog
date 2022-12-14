package com.devsuperior.dscatalog.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
//rota REST (requisições web) do recurso
public class CategoryResource {
	/**
	 * Recebe requisições da API(a API ajudará a comunicar o que você quer ao sistema 
	 * para que ele entenda e realize o que foi solicitado).Pense nas APIs como um mediador 
	 * entre os usuários ou clientes e os recursos ou serviços web que eles querem obter.
	 */
	
	@Autowired
	//injeta dependencia com a camada service que chama repository
	private CategoryService service;
	
	@GetMapping
	//Anotação para mapear solicitações HTTP
	public ResponseEntity<List<CategoryDTO>> findAll(){
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	//Anotação para mapear solicitações HTTP
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
		CategoryDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	//inserir novo recurso
	public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();	
	return ResponseEntity.created(uri).body(dto);
	}
}
