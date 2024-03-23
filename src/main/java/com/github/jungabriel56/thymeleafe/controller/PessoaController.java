package com.github.jungabriel56.thymeleafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.jungabriel56.thymeleafe.model.Pessoa;
import com.github.jungabriel56.thymeleafe.repository.PessoaRepositoryMockup;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepositoryMockup pessoaRepository;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String lista(Model model) {
		List<Pessoa> pessoas = pessoaRepository.list();
		model.addAttribute("pessoas", pessoas);
		
		return "pessoa/lista.html";
	}
	
}
