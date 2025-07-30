package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.tarefaRepository;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class tarefaService {
    private tarefaRepository userRepo;

    private ResponseEntity CreateTarefa(Tarefa tarefa){
        userRepo.save(tarefa);
        //com Tarefa tarefa estou declarando a classe Tarefa como umna variavel para usar todas variaveis e metodos.
     return ResponseEntity.ok().body("Tarefa Atribuida!");
    }
}
