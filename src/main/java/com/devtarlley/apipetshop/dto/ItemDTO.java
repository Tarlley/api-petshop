package com.devtarlley.apipetshop.dto;

import com.devtarlley.apipetshop.model.Categoria;
import lombok.Data;

@Data
public class ItemDTO {

    private Integer id;

    private String nome;

    private Double preco;

    private Categoria categoria;



}
