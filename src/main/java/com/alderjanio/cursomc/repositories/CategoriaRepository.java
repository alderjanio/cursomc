package com.alderjanio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alderjanio.cursomc.domain.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
