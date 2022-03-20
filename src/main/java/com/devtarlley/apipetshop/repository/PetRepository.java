package com.devtarlley.apipetshop.repository;


import com.devtarlley.apipetshop.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {

    @Query(value = "SELECT * FROM PET",nativeQuery = true)
    List<Pet> buscarPet();
}
