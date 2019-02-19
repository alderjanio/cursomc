package com.alderjanio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alderjanio.cursomc.domain.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
