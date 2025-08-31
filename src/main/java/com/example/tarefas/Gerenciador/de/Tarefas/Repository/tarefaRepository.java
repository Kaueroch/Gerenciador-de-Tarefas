package com.example.tarefas.Gerenciador.de.Tarefas.Repository;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

@Repository
public interface tarefaRepository extends JpaRepository<Tarefa,Long> {

}
