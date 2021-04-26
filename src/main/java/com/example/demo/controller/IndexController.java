package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
	
	@GetMapping("/Login")
	public String exibirLogin() {
		return "index";
	}

	@GetMapping("/telaInicial")
	public String telaInicial() {
		return "telaInicial";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}
	
	@GetMapping("/cadProfessores")
	public String cadProfessores() {
		return "cadProfessores";
	}
	
	@GetMapping("/Professores")
	public String Professores() {
		return "Professores";
	}
	
	@GetMapping("/cadDisciplinas")
	public String cadDisciplinas() {
		return "cadDisciplinas";
	}
	
	@GetMapping("/Disciplinas")
	public String Disciplinas() {
		return "Disciplinas";
	}
}
