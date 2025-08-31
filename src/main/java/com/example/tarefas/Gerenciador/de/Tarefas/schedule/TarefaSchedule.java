package com.example.tarefas.Gerenciador.de.Tarefas.schedule;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.statusTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.tarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.awt.desktop.SystemSleepListener;
import java.time.LocalDate;
import java.util.List;

@Component
public class TarefaSchedule {
    @Autowired
    tarefaRepository tarefaRepo;

    @Scheduled(cron = "0 0 0 * * ?") //ira executar o metodo todos os dias a meia noite
    public void verificarTarefasAtrasadas(){
        LocalDate hoje = LocalDate.now(); //para pegar a data do dia atual
        List<Tarefa> tarefas = tarefaRepo.findAll(); // lista que ira retornar todas as tarefas

        for(Tarefa tarefa : tarefas){ //verificar cada tarefa e fazer a verificao abaixo
         if(tarefa.getDataVencimento().isBefore(hoje)){
             tarefa.setStatus(statusTarefa.ATRASADO);
             tarefaRepo.save(tarefa);
         }
        }
        System.out.println("Verificacao Diaria deu certo");
    }
}
