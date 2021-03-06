package com.devtarlley.apipetshop.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento {

    @Id
    private Integer id;

    private Integer estado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pagamento pagamento = (Pagamento) o;
        return id != null && Objects.equals(id, pagamento.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
