package com.example.tarefas.Gerenciador.de.Tarefas.Service;

import com.example.tarefas.Gerenciador.de.Tarefas.DTO.LoginAuthenticationDTO;
import com.example.tarefas.Gerenciador.de.Tarefas.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//Classe de servico que sera chamada toda vez que o sistema precisar autenticar um usuario.
@Service
public class AuthorizationService implements UserDetailsService{
  //implementei essa classe para dizer ao spring security que esta sera o classe de autenticacao
   private UserRepository userRepo;
    private AuthenticationManager authenticationManager;
   public AuthorizationService(UserRepository userRepo, AuthenticationManager authenticationManager) {
       this.userRepo = userRepo; //injecao de dependencia via Construtor anotar no caderno essa mudanca e o porque dela
       this.authenticationManager = authenticationManager;
       //anotar que deve ir e enfrentar o problema e interpretar ele. Assim, lhe fara um DEV melhor BORA BUSCARAAINGJAGFNAJG
       // com o parametro eu garanto que o userRepo sempre tera um valor(podendo ser null tambem)
       //mas em sua grande maioria sempre ira ser igual a algum valor(nesse caso, metodos e contratos)
   }

    @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         return userRepo.findByusername(username);
    }

    public ResponseEntity login(LoginAuthenticationDTO data){
       var userPassword = new UsernamePasswordAuthenticationToken(data.username(), data.password());
        //essa variavel ira formar um token com o username e o password juntos, gerando um codigo que ira representar esses dois campos.
        var auth = authenticationManager.authenticate(userPassword);//pegando a instancia do objeto acima que injetou a dependencia e gerando o token os campos juntos.
       return ResponseEntity.ok().build();
   }
}