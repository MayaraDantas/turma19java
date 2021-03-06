package br.com.generation_turma_19.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation_turma_19.farmacia.model.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository< Produto, Long>{
 public List <Produto>findAllByTituloContainingIgnoreCase(String titulo);
 
	
	
	
}
