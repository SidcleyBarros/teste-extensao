package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pessoas;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Integer> {

	Optional<Pessoas> findByNome(String nome);

}
