package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Usuario;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//Classe de servico que sera chamada toda vez que o sistema precisar autenticar um usuario.
@Service
public class AuthorizationService implements UserDetailsService {
  //implementei essa classe para dizer ao spring security que esta sera o classe de autenticacao
    @Autowired
    UserRepository userRepo;
     Usuario user;
    @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         return userRepo.findByUsername(username);
    }
}