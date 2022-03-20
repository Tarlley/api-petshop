package com.devtarlley.apipetshop.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String CPF;

    private String nome;

    private String email;

    @ManyToMany
    @JoinTable(name = "proprietario_pets",
            joinColumns = @JoinColumn(name = "proprietario_id"),
            inverseJoinColumns = @JoinColumn(name = "pets_id"))
    private List<Pet> pets = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "telefone")
    private Set<String> telefones = new HashSet<>();


    @OneToMany(mappedBy = "proprietario")
    private List<Pedido> pedidos = new ArrayList<>();


    public Proprietario(Integer id, String CPF, String nome, String email) {
        this.id = id;
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Proprietario that = (Proprietario) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
