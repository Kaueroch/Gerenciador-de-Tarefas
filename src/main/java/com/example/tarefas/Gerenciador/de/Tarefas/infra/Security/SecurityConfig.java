package com.example.tarefas.Gerenciador.de.Tarefas.infra.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

//Definindo que essa classe sera a classe de seguranca.
// Ou seja, qualquer metodo criado aqui envolvendo seguranca podera ser chamado quando a classe for referenciada.
@Configuration
@EnableWebSecurity //estou dizendo ao Spring para habilitar a seguranca da WEB para que eu possa configurar
// assim, desabilitando a tela de login padrao feita pelo Spring security qeu aparece ao tentar acessar um end point da aplicacao.
public class SecurityConfig {
//para desabilitarmos a seguranca padrao do spring security com
// aquela tela de login, devemos usar o SecurityFilterChain,
// que nao eh nada mais que uma serie de verificacoes, para verificar se o usuario
// esta apto ou nao para realizar requiscioes em nossa pagina,entende? ou ate mesmo
// se esta apto a realizar requisicoes que so determinados tipos de users teriam.
   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) //estamos declarando que ao o usuario ser autenticado,
                // o token irá ser reutilizado para buscar todas as informações do mesmo.
                .authorizeHttpRequests(authorize ->  authorize
                        .requestMatchers(HttpMethod.POST, "/api/tarefa").hasRole("USER")//qualquer request do tipo POST que for mandada para o endpoint so podera ser feita caso o usuario estiver com a ROLE de Usuario
                // nesse metodo, estamos autorizando quais HTTP request vao poder ser autorizada/autenticadas
                        .anyRequest().authenticated()) //qualquer tipo de request que nao seja ess, podera ser enviada
                        //como no meu caso nao tenho utilidade para isso ainda,irei deixar comentado,mas irei anotar para aprender.
                .build();
    }
}