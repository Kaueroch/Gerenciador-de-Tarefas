package com.example.tarefas.Gerenciador.de.Tarefas.Enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum prioridadeTarefa {
    NENHUMA("Nenhuma"),
    BAIXA("Baixa"),
    MEDIA("Media"),
    ALTA("Alta");

    private String prioridade;

    prioridadeTarefa(String prioridade) {
        this.prioridade = prioridade;
    }
    public String getPrioridade() {
        return prioridade;
    }
}