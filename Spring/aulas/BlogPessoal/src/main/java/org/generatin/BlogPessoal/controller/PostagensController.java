package org.generatin.BlogPessoal.controller;

import java.util.List;

import org.generatin.BlogPessoal.Model.postagens;
import org.generatin.BlogPessoal.repository.PostagensRepository;
import org.hibernate.validator.internal.metadata.aggregated.PotentiallyContainerCascadingMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagensController {

	@Autowired
	private PostagensRepository repository;
	   
	
	   @GetMapping 
	   public ResponseEntity<List<postagens>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	   }
	
	   @GetMapping("/{id}")
	   public ResponseEntity <postagens> GetById(@PathVariable long id){
		    return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		    
	   }
	   
	   @GetMapping("/titulo/{titulo}")
	   public ResponseEntity<List<postagens>> GetByTitulo(@PathVariable String titulo){
		   return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	   }
	}
	

