package com.example.tarefas.Gerenciador.de.Tarefas.Repository;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long> {
    UserDetails findByUsername(String username);

}