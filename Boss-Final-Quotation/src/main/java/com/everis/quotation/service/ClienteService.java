package com.everis.quotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.quotation.model.Cliente;
import com.everis.quotation.respository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	public List<Cliente> listarCliente(){
		List<Cliente >cliente = clienteRepository.findAll();
	return cliente;
	}
}
