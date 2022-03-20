package com.devtarlley.apipetshop.repository;

import com.devtarlley.apipetshop.model.Especie;
import com.devtarlley.apipetshop.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
}
