package com.example.tarefas.Gerenciador.de.Tarefas.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.UUID;
//REPRESENTA NOSSA TABELA NO CAMPO, entao nao faz sentido colocar as validacoes aqui.
// Somente as especificacoes da COLUNA.
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @org.hibernate.validator.constraints.UUID
    @Column(unique = true, nullable = false)
    private UUID public_ID;
    private String Name;
    @Column(unique = true,nullable = false)
    private String Username;
    @Column(unique = true,nullable = false)
    private String Email;
    private String password;
    private String confirm_Password;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public @org.hibernate.validator.constraints.UUID UUID getPublic_ID() {
        return public_ID;
    }

    public void setPublic_ID(@org.hibernate.validator.constraints.UUID UUID public_ID) {
        this.public_ID = public_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_Password() {
        return confirm_Password;
    }

    public void setConfirm_Password(String confirm_Password) {
        this.confirm_Password = confirm_Password;
    }
}