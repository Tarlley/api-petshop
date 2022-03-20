package com.devtarlley.apipetshop.model;

import lombok.*;
import org.hibernate.Hibernate;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "raca")
public class Raca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "especie_id")
    private Especie especie;

    @OneToMany(mappedBy = "raca_pet")
    private List<Pet> pets = new ArrayList<>();

    public Raca(Integer id, String nome, Especie especie) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Raca raca = (Raca) o;
        return id != null && Objects.equals(id, raca.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}