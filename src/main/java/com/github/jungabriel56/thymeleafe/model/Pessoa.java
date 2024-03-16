package com.github.jungabriel56.thymeleafe.model;

public class Pessoa {
	private Long id;
	private String nome;
	private String sexo;
	
	
	public Pessoa(Long id, String nome, String sexo) {
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
