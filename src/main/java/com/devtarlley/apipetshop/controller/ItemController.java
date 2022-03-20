package com.devtarlley.apipetshop.controller;

import com.devtarlley.apipetshop.dto.ItemDTO;
import com.devtarlley.apipetshop.mapper.ItemMapper;
import com.devtarlley.apipetshop.model.Item;
import com.devtarlley.apipetshop.service.ItemService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "item")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @GetMapping
    ResponseEntity<List<ItemDTO>> buscarTodosItens(){
        return ResponseEntity.ok().body(itemService.buscarTodosItens());
    }
}
