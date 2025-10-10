package com.example.tarefas.Gerenciador.de.Tarefas.Controller;

import com.example.tarefas.Gerenciador.de.Tarefas.DTO.LoginAuthenticationDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth") //sempre que chamar o end point auth ira ficar disponivel end points dessa classs
public class authenticationController {
 //nao esquecer de colocar o @Request Body para receber o objeto inteiro e pegar os valores necessarios e
    // @valid para os campos serem validados
    //revisar o codigo depois e separar as responsabilidades
//    public ResponseEntity login(@RequestBody @Valid LoginAuthenticationDTO data)
}
