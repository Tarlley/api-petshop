package com.devtarlley.apipetshop.controller;

import com.devtarlley.apipetshop.dto.PetDTO;
import com.devtarlley.apipetshop.model.Pet;
import com.devtarlley.apipetshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public ResponseEntity<List<PetDTO>> findAll(){
        return ResponseEntity.ok().body(petService.findAll());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Optional<Pet>> find(@PathVariable Integer id){
        return ResponseEntity.ok().body(petService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void>insert (@RequestBody Pet obj){
        PetDTO petDTO = petService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(petDTO.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
