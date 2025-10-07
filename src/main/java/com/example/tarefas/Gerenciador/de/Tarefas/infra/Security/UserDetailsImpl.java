package com.example.tarefas.Gerenciador.de.Tarefas.infra.Security;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.UserRoles;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {
    private Usuario user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(user.getRoles() == UserRoles.USER)
            return List.of(new SimpleGrantedAuthority("USER_ROLE"));
        else{
            return List.of(new SimpleGrantedAuthority("GUEST_ROLE"));
        }
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    //faz sentido validar esses campos ja que o username ira ser unico e nao pode ser repetido.
    @Override
    public String getUsername() {
        return user.getUsername();
    }
}
