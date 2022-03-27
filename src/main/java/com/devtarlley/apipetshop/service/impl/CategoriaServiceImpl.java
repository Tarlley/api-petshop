package com.devtarlley.apipetshop.service.impl;

import com.devtarlley.apipetshop.dto.CategoriaDTO;
import com.devtarlley.apipetshop.mapper.CategoriaMapper;
import com.devtarlley.apipetshop.repository.CategoriaRepository;
import com.devtarlley.apipetshop.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    private final CategoriaMapper mapper;


    public CategoriaServiceImpl(CategoriaRepository categoriaRepository, CategoriaMapper mapper) {
        this.categoriaRepository = categoriaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<CategoriaDTO> findAll() {
        return mapper.toCategoriaDTO(categoriaRepository.findAll());
    }
}
