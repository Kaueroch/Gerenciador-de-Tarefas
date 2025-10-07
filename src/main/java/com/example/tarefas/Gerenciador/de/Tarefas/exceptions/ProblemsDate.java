package com.example.tarefas.Gerenciador.de.Tarefas.exceptions;

public class ProblemsDate  extends RuntimeException{
    public ProblemsDate(){
        super("Coloque a Data de Vencimento a partir do dia de hoje..");
        //um construtor onde ira chamar a exception e passar a mensagem acima
    }
    public ProblemsDate(String message){
        super(message); //construtor que ira devolver a mensagem ao usuario.
    }
}