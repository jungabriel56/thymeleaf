package com.github.jungabriel56.thymeleafe.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.jungabriel56.thymeleafe.model.Pessoa;
import com.github.jungabriel56.thymeleafe.model.SexoTipo;

public class PessoaRepositoryMockup {
	
	//1		Pelé	 M
	//2		Elizabeth	F
	
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();

		Pessoa pessoa = new Pessoa(1L, "Pelé", SexoTipo.M);
		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Elizabeth", SexoTipo.F);
		
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", SexoTipo.F));
		
		return result;
	}
	
}
