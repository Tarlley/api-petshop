package com.devtarlley.apipetshop.repository;

import com.devtarlley.apipetshop.model.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie,Integer> {
}
