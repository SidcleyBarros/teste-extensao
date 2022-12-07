package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoas;
import com.example.demo.service.PessoasService;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

	@Autowired
	PessoasService PessoasService;
	
	@PostMapping
	public Pessoas save(@RequestBody Pessoas Pessoas) {
		return PessoasService.save(Pessoas);	
	}
	
	@GetMapping
	public List<Pessoas> getAll() {
		return PessoasService.getAll();
	}
	
	@GetMapping("/nome")
	public Optional<Pessoas> findByNome (@RequestParam String nome) {
		return PessoasService.findByNome(nome);
		
	}
}
