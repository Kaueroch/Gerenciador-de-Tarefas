package com.example.tarefas.Gerenciador.de.Tarefas.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private String descricao;
    private LocalDateTime DataVencimento; //para o sistema retornar a data e horario exato que a tarefa foi adicionada
    @Enumerated(EnumType.STRING)
    private String Status;
    @Enumerated(EnumType.STRING)
    private String Prioridades;

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPrioridades() {
        return Prioridades;
    }

    public void setPrioridades(String prioridades) {
        Prioridades = prioridades;
    }
}