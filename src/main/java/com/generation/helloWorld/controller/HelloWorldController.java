package com.generation.helloWorld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "hello world";
	}
	@GetMapping("/lista-bsm")
    public String listaBsm(){
            ArrayList <String> bsm = new ArrayList<String>();
            bsm.add("Responsabilidade Pessoal");
            bsm.add("Mentalidade de crescimento");
            bsm.add("Orientação ao futuro");
            bsm.add("Persistência");
            bsm.add("Comunicação");
            bsm.add("Trabalho em equipe");
            bsm.add("Proativida");
            bsm.add("Orientação ao detalhe");

            return "Bsms: "+bsm;
    }
	@GetMapping("/objetivo")
	public String objetivo() {
		ArrayList <String> objetivo = new ArrayList<String>();
		objetivo.add("estudar spring");
		objetivo.add("organizar meu tempo melhor");
		objetivo.add("desenvolver o blog pessoal");
		
		return "Objetivos" +objetivo;
	}
}
