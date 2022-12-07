package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pessoas;
import com.example.demo.repository.PessoasRepository;

@Service
public class PessoasService {
	
	@Autowired
	PessoasRepository pessoasRepository;
	
	public Pessoas save(Pessoas Pessoas) {
		return pessoasRepository.save(Pessoas);
		
	}
	
	public List<Pessoas> getAll() {
		return pessoasRepository.findAll();
		
	}
	
	public Optional<Pessoas> findByNome(String nome) {
		return pessoasRepository.findByNome(nome);
		}
		
	}
