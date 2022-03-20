package com.devtarlley.apipetshop.repository;

import com.devtarlley.apipetshop.model.Categoria;
import com.devtarlley.apipetshop.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
}
