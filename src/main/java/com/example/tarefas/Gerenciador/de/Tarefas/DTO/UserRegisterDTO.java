package com.example.tarefas.Gerenciador.de.Tarefas.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
//para referneciarr o objeto no controller para salvar com base nesse modelo, somente referneciar objeto igual faz com Tarefa tarefa.
@Getter
@Setter
@AllArgsConstructor
public class UserRegisterDTO {
    @NotNull(message="name nao pode ser null")
    private String name;
    @NotNull(message="username nao pode ser null")
    private String Username;

    @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
    message = "Invalid email address format")
    @Email
    private String Email;
    @NotNull(message="password nao pode ser null")
    private String password;
    @NotNull(message="Confirme sua Senha")
    private String confirm_Password;
}
