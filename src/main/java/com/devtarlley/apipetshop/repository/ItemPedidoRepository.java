package com.devtarlley.apipetshop.repository;

import com.devtarlley.apipetshop.model.Especie;
import com.devtarlley.apipetshop.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer> {
}
