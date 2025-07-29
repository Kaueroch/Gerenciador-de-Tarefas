package com.example.tarefas.Gerenciador.de.Tarefas.Repository;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Tarefa,Long> {

}
