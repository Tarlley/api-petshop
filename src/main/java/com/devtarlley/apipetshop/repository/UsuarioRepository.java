package com.devtarlley.apipetshop.repository;

import com.devtarlley.apipetshop.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query("select u from Usuario u where u.userName = :username")
    Optional<Usuario> findByLogin(@Param("username") String usarname);
}
