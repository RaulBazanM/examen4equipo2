package com.everis.quotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.quotation.model.Cliente;
import com.everis.quotation.service.ClienteService;

@RestController
@RequestMapping("")
@ResponseBody
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listarCliente(){
		return clienteService.listarCliente();
	}
}
