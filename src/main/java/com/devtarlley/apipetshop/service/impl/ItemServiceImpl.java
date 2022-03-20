package com.devtarlley.apipetshop.service.impl;

import com.devtarlley.apipetshop.dto.ItemDTO;
import com.devtarlley.apipetshop.dto.PetDTO;
import com.devtarlley.apipetshop.mapper.ItemMapper;
import com.devtarlley.apipetshop.model.Item;
import com.devtarlley.apipetshop.repository.ItemRepository;
import com.devtarlley.apipetshop.service.ItemService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    ItemMapper mapper = Mappers.getMapper(ItemMapper.class);


    @Override
    public List<ItemDTO> buscarTodosItens() {
        return mapper.toItemDTO(itemRepository.findAll());
    }

}
