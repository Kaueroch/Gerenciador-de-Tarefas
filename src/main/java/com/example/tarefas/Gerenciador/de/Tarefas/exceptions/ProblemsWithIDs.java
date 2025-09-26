package com.example.tarefas.Gerenciador.de.Tarefas.exceptions;

public class ProblemsWithIDs extends RuntimeException{
    public ProblemsWithIDs(){
        super("ID nao encontrado.");
        //um construtor onde ira chamar a exception e passar a mensagem acima
    }
    public ProblemsWithIDs(String message){
        super(message); //construtor que ira devolver a mensagem ao usuario.
    }
}

