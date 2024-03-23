package com.github.jungabriel56.thymeleafe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private Long id;
	private String nome;
	private SexoTipo sexo;
	
	
	public Pessoa(Long id, String nome, SexoTipo sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SexoTipo getSexo() {
		return sexo;
	}
	public void setSexo(SexoTipo sexo) {
		this.sexo = sexo;
	}
	
}
