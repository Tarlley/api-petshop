package com.devtarlley.apipetshop.service;

import com.devtarlley.apipetshop.dto.ItemDTO;
import com.devtarlley.apipetshop.model.Item;

import java.util.List;

public interface ItemService {

    List<ItemDTO> buscarTodosItens();
}
