package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.prioridadeTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Enums.statusTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.tarefaRepository;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsDate;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithIDs;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class tarefaService {
    @Autowired
    private tarefaRepository userRepo;

    public Tarefa CreateTarefa(Tarefa tarefa){
        //com Tarefa tarefa estou declarando a classe Tarefa como umna variavel para usar todas variaveis e metodos.
        LocalDateTime DataAtual = LocalDateTime.now();
        if(tarefa.getDataVencimento().isBefore(ChronoLocalDate.from(DataAtual))){
           throw new ProblemsDate();
        }else
        return userRepo.save(tarefa);
    }
    //linhs para quando o usuario clicar em concluir
    public Tarefa AtualizarTarefa(Tarefa tarefa){
    tarefa.setStatus(statusTarefa.CONCLUIDA);
     return userRepo.save(tarefa);
    }

    public ResponseEntity Deletetarefa(@PathVariable Long id){
        if(!userRepo.existsById(id)){
            throw new ProblemsWithIDs();
        }else{
            userRepo.deleteById(id);
        }
        return ResponseEntity.ok("Tarefa Deletada");
    }
}