package br.com.generation_turma_19.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation_turma_19.farmacia.model.Categoria;

@Repository
public interface  CategoriaRepository extends JpaRepository< Categoria, Long> {
    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
    
  
}
