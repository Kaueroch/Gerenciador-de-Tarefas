package com.example.tarefas.Gerenciador.de.Tarefas.Model;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.prioridadeTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Enums.statusTarefa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull //servindo como verificaccao tanto apra o front quanto para o back
    private String descricao;
    private LocalDate DataRegistro; //para o sistema retornar a data e horario exato que a tarefa foi adicionada
    @NotNull
    private LocalDate DataVencimento;
    @Enumerated(EnumType.STRING)
    private statusTarefa Status;
    @Enumerated(EnumType.STRING)
    @NotNull( message = "Prioridades nao pode ser null")
    @Column(nullable = false)
    private prioridadeTarefa Prioridades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataRegistro() {
        return DataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        DataRegistro = dataRegistro;
    }

    public LocalDate getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public Enum getStatus() {
        return Status;
    }

    public void setStatus(statusTarefa status) {
        Status = status;
    }

    public Enum getPrioridades() {
        return Prioridades;
    }

    public void setPrioridades(prioridadeTarefa prioridades) {
        Prioridades = prioridades;
    }
}