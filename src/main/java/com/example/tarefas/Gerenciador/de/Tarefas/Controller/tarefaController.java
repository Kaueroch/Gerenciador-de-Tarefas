package com.example.tarefas.Gerenciador.de.Tarefas.Controller;

import com.example.tarefas.Gerenciador.de.Tarefas.Enums.prioridadeTarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Model.Tarefa;
import com.example.tarefas.Gerenciador.de.Tarefas.Service.tarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/tarefa")
public class tarefaController {
    @Autowired
    tarefaService tarefaservice;

    @PostMapping("/create") //Request que sera chamada pelo botao adicionar do front
    public ResponseEntity createTarefa(@RequestBody  Tarefa tarefa){
     tarefaservice.CreateTarefa(tarefa);
     return ResponseEntity.ok("Tarefa Adicionada");
    }
   @DeleteMapping("/delete")
   public ResponseEntity deleteTarefa(Tarefa tarefa){ //request que sera chamada pelo botao excluir apos o usuario clicar
       tarefaservice.Deletetarefa(tarefa);
        return ResponseEntity.ok("Tarefa Deletada");
   }


   @PutMapping("/updateStatus")
   public ResponseEntity alterarStatus(Tarefa tarefa){//alterar o status da tarefa apos clicar em concluir do usuario, dia passar do prazo ou expirando no dia
       tarefaservice.AtualizarTarefa(tarefa);
       return ResponseEntity.ok("Tarefa Atualizada");
   }
}