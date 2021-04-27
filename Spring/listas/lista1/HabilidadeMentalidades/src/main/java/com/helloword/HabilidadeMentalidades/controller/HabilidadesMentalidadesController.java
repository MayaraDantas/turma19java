package com.helloword.HabilidadeMentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HabilidadesMentalidades")

public class HabilidadesMentalidadesController {
	@GetMapping
	public String HabilidadesMentalidades() {
		return "Persistencia, Mentalidade de crescimento, Atenção aos detalhes.";
	}
}
