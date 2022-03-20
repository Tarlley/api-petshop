package com.devtarlley.apipetshop.dto;

import com.devtarlley.apipetshop.model.Endereco;
import com.devtarlley.apipetshop.model.Proprietario;
import com.devtarlley.apipetshop.model.Raca;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PetDTO {

    private Integer id;
    private String nome;
    private Date Nascimento;
//    private Raca raca_pet;
//    private List<Proprietario> proprietarios = new ArrayList<>();
//    private Endereco enderecoEntrega;
}
