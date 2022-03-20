package com.devtarlley.apipetshop.service;

import com.devtarlley.apipetshop.dto.PetDTO;
import com.devtarlley.apipetshop.model.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {
    List<PetDTO> findAll();

    Optional<Pet> findById(Integer id);

    PetDTO insert(Pet obj);
}
