package com.principal.apiforo.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.principal.apiforo.entities.Usuario;
import com.principal.apiforo.repositories.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNombre(username).orElseThrow(() -> new UsernameNotFoundException(username));

        Collection<? extends GrantedAuthority> authority = Arrays.asList(new SimpleGrantedAuthority("ROLE_".concat(usuario.getPerfil().getNombre())));

        return new User(username, usuario.getContrasena(), authority);
    }

}
