package com.devtarlley.apipetshop.mapper;

import com.devtarlley.apipetshop.dto.PetDTO;
import com.devtarlley.apipetshop.model.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface PetMapper {
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    PetDTO toPetDto(Pet pet);
    Pet toPet(PetDTO petDTO);

    List<PetDTO> toPetDto(List<Pet> pets);
    List<Pet> toPet(List<PetDTO> petDTOS);

    PetDTO toPetDto(Optional<Pet> petOptional);
}
