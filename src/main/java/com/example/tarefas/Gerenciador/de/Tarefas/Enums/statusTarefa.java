package com.example.tarefas.Gerenciador.de.Tarefas.Enums;


public enum statusTarefa {
    PENDENTE("Pendente"),
    CONCLUIDA("Concluida"),
    ATRASADO("Atrasado");

   private String statusTarefa;
    statusTarefa(String status){
        this.statusTarefa = status;
    }
}