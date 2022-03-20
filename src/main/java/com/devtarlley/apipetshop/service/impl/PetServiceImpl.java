package com.devtarlley.apipetshop.service.impl;

import com.devtarlley.apipetshop.dto.PetDTO;
import com.devtarlley.apipetshop.mapper.PetMapper;
import com.devtarlley.apipetshop.model.Pet;
import com.devtarlley.apipetshop.repository.PetRepository;
import com.devtarlley.apipetshop.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {


    private final PetRepository petRepository;

    private final PetMapper petMapper;

    public PetServiceImpl(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }



    @Override
    public List<PetDTO> findAll() {
        return petMapper.toPetDto(petRepository.findAll());
    }

    @Override
    public Optional<Pet> findById(Integer id){
        return petRepository.findById(id);
    }

    @Override
    public PetDTO insert(Pet obj){
        return petMapper.toPetDto(petRepository.saveAndFlush(obj));
    }
}

