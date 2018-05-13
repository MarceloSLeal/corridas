package com.marcelo.corridas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcelo.corridas.model.Motorista;

@Controller
public class MotoristasController {

	@RequestMapping("/motoristas/novo")
	public String novo() {
		return "motorista/CadastroMotorista";
	}
	
	@RequestMapping(value = "/motoristas/novo", method = RequestMethod.POST)
	public String cadastrar(Motorista motorista) {
		System.out.println(">>>> id: " + motorista.getId());
		return "motorista/CadastroMotorista";
	}
	
}
