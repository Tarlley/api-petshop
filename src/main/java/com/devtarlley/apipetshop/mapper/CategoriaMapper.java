package com.devtarlley.apipetshop.mapper;

import com.devtarlley.apipetshop.dto.CategoriaDTO;
import com.devtarlley.apipetshop.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    public static final CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO toCategoriaDTO(Categoria categoria);
    Categoria toCategoria(CategoriaDTO categoriaDTO);

    List<CategoriaDTO> toCategoriaDTO(List<Categoria> categorias);
    List<Categoria> toCategoria(List<CategoriaDTO> categoriaDTOS);
}
