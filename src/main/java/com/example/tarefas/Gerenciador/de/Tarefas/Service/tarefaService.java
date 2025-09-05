package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.prioridadeTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Enums.statusTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.tarefaRepository;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.Date;

@org.springframework.stereotype.Service
public class tarefaService {
    @Autowired
    private tarefaRepository userRepo;

    public ResponseEntity CreateTarefa(Tarefa tarefa){
        //com Tarefa tarefa estou declarando a classe Tarefa como umna variavel para usar todas variaveis e metodos.
        userRepo.save(tarefa);
            return ResponseEntity.ok().body("Tarefa Adicionada ");
    }
    public ResponseEntity AtualizarTarefa(Tarefa tarefa){
        tarefa.setStatus(statusTarefa.CONCLUIDA); //linhs para quando o usuario clicar em concluir
        tarefa.setDescricao(tarefa.getDescricao());
        tarefa.setDataVencimento(tarefa.getDataVencimento());
//        tarefa.setPrioridades();
        tarefa.setDataRegistro(tarefa.getDataRegistro());
        userRepo.save(tarefa);
        return ResponseEntity.ok("Status alterado");
        //como irei atualizar o campo e salvo-lo novamente, para nao acontecer do campos sairem nulos
        // atualizo os campos com os valores atuais(getters) e tudo fica certo e resolvido.
    }

    public ResponseEntity Deletetarefa(Tarefa tarefa){

        userRepo.delete(tarefa);
        return ResponseEntity.ok("Tarefa Deletado");
    }
}