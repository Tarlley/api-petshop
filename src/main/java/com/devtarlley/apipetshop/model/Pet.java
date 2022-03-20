package com.devtarlley.apipetshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date nascimento;

    @ManyToOne
    @JoinColumn(name = "raca_pet_id")
    private Raca raca_pet;

    @ManyToMany(mappedBy = "pets")
    @ToString.Exclude
    private List<Proprietario> proprietarios = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "endereco_entrega_id")
    private Endereco enderecoEntrega;

    public Pet(Integer id, String nome, Date nascimento, Endereco enderecoEntrega, Raca raca_pet) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca_pet = raca_pet;
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pet pet = (Pet) o;
        return id != null && Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
