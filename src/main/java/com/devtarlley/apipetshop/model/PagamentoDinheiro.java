package com.devtarlley.apipetshop.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class PagamentoDinheiro extends Pagamento{

    private Date dataPagamento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PagamentoDinheiro that = (PagamentoDinheiro) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
