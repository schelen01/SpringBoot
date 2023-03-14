package com.example.meuProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping ("/") //Mapeando o rota
public class MeuProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoApplication.class, args);



	}
	@GetMapping
	public  String olaMundo() {
		return "Ola Mundo";
	}
}
