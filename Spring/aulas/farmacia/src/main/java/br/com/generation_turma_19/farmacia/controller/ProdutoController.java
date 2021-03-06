package br.com.generation_turma_19.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation_turma_19.farmacia.model.Categoria;
import br.com.generation_turma_19.farmacia.model.Produto;
import br.com.generation_turma_19.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@GetMapping
	private ResponseEntity<List<Produto>> findAllProduto() {

		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	private ResponseEntity<Produto> findAllProduto(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

	}

	@GetMapping("/titulo/{titulo}")
	private ResponseEntity<List<Produto>> findByTipoProduto(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));

	}

	@PostMapping
	private ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

	@PutMapping
	private ResponseEntity<Produto> putProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}

	@DeleteMapping("/{id}")
	private void deleteProduto(@PathVariable long id) {
		repository.deleteById(id);
	}
}
