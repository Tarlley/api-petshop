package com.devtarlley.apipetshop.controller;

import com.devtarlley.apipetshop.dto.CategoriaDTO;
import com.devtarlley.apipetshop.model.Categoria;
import com.devtarlley.apipetshop.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll(){
        return ResponseEntity.ok().body(categoriaService.findAll());
    }
}
