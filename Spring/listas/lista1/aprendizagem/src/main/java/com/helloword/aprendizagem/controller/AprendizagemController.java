package com.helloword.aprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizagem")

public class AprendizagemController {
	@GetMapping
	public String Aprendizagem() {
		return "Aprender mais sobre spring, revisar Mysql e finalmente mergulhar no Back-End.";

	}

}
