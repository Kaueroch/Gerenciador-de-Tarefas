package com.example.tarefas.Gerenciador.de.Tarefas.Repository;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Usuario;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario,Long> {
}
