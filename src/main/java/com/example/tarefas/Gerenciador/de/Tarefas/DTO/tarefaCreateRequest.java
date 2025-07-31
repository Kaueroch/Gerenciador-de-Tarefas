package com.example.tarefas.Gerenciador.de.Tarefas.DTO;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.UUID;

public class tarefaCreateRequest {
    private UUID ID;
    @NotBlank
    private String descricao;
    @NotBlank
    private LocalDateTime DataVencimento;
    @NotBlank
    private String Status;
    @NotBlank
    private String Prioridades;
    //para nao haver confusao e sobreescrita de valores por parte do spring e do DTO ao receber os valores.
    public tarefaCreateRequest(String descricao, LocalDateTime dataVencimento, String status, String prioridades) {
        this.descricao = descricao;
        this.DataVencimento = dataVencimento;
        this.Status = status;
        this.Prioridades = prioridades;
    }
   //Getters e setters para acessar e modificar cada valor.
    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
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

    public String getPrioridades() {
        return Prioridades;
    }

    public void setPrioridades(String prioridades) {
        Prioridades = prioridades;
    }
}
