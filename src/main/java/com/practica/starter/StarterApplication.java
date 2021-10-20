package com.practica.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.Saludo;

@SpringBootApplication
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
		Saludo saludo = new Saludo("Italiano");
		System.out.println(saludo.mensajeSaludo());
		saludo.setIdioma("Ingles");
		System.out.println(saludo.mensajeSaludo());
	}

}
