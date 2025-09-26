package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.prioridadeTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Enums.statusTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.tarefaRepository;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithIDs;
import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.Date;

@org.springframework.stereotype.Service
public class tarefaService {
    @Autowired
    private tarefaRepository userRepo;

    public Tarefa CreateTarefa(Tarefa tarefa){
        //com Tarefa tarefa estou declarando a classe Tarefa como umna variavel para usar todas variaveis e metodos.
        return userRepo.save(tarefa);
    }
    public ResponseEntity AtualizarTarefa(Tarefa tarefa){
        tarefa.setStatus(statusTarefa.CONCLUIDA); //linhs para quando o usuario clicar em concluir
        tarefa.setDescricao(tarefa.getDescricao());
        tarefa.setDataVencimento(tarefa.getDataVencimento());

        tarefa.setDataRegistro(tarefa.getDataRegistro());
        userRepo.save(tarefa);
        return ResponseEntity.ok("Status alterado");
        //como irei atualizar o campo e salvo-lo novamente, para nao acontecer do campos sairem nulos
        // atualizo os campos com os valores atuais(getters) e tudo fica certo e resolvido.
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