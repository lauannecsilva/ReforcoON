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
}
