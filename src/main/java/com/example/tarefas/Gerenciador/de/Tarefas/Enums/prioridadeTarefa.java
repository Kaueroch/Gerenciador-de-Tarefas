package com.example.tarefas.Gerenciador.de.Tarefas.Enums;

public enum prioridadeTarefa {
    BAIXA("Baixa"),
    MEDIA("Media"),
    ALTA("Alta");

    private String prioridade;

    prioridadeTarefa(String prioridade) {
     this.prioridade = prioridade;
    }
}