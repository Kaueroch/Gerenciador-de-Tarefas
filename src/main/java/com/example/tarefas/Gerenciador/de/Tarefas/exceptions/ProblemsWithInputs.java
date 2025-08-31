package com.example.tarefas.Gerenciador.de.Tarefas.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class ProblemsWithInputs extends RuntimeException{
    //eh necessario extender classe para transforma essa classe em uma exception
    // mas de forma customizada, o que eh chamado de Custom Exception.
    public ProblemsWithInputs(){
        super("Por favor Preencha todos os campos de maneira correta");
        //um construtor onde ira chamar a exception e passar a mensagem acima
    }
    public ProblemsWithInputs(String message){
        super(message); //construtor que ira devolver a mensagem ao usuario.
    }
}
