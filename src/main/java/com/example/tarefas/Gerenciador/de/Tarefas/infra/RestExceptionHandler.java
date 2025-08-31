package com.example.tarefas.Gerenciador.de.Tarefas.infra;

import com.example.tarefas.Gerenciador.de.Tarefas.exceptions.ProblemsWithInputs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//essa classe em si serve para tratar diversos erros diferentes que podem existir dentro da nossa aplicacao.
// Assim, criando uma forma de padronizar quando cada erro acontecer e evitar escrever diversos try catchs
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ProblemsWithInputs.class)
    private ResponseEntity<String> FixingInputs(ProblemsWithInputs ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Por favor Preencha todos os campos de maneira correta");
     //esse erro so sera chamado caso o sistema retorne uma chamada de BAD Request, assim padronizando
        //para todos os campos. Tenho que ver isso melhor e analisar o erro que o sistema devolveria para padronizar ele.
    }
}
