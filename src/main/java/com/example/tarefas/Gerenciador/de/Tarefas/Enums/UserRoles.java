package com.example.tarefas.Gerenciador.de.Tarefas.Enums;

public enum UserRoles {
    GUEST("Convidado"),
    USER("Usuario");

    private String roles;

    UserRoles(String roles){
        this.roles = roles;
    }

    public String getRole(){
        return roles;
    }
}

