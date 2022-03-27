package com.devtarlley.apipetshop.service.impl;

import com.devtarlley.apipetshop.model.Usuario;
import com.devtarlley.apipetshop.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findByLogin(username);

        if (usuario == null){
            throw new UsernameNotFoundException("Usuáiro não encontrado!");
        }

        return new User(usuario.getUserName(),usuario.getPassword(),null);
    }
}
