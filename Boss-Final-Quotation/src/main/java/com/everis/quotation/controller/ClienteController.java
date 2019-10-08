package com.everis.quotation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.quotation.model.Cliente;
import com.everis.quotation.model.Servicio;
import com.everis.quotation.proxy.ComputeProxy;
import com.everis.quotation.response.ClienteResponse;
import com.everis.quotation.response.ComputeResponse;
import com.everis.quotation.response.QuotationResponse;
import com.everis.quotation.respository.ClienteRepository;
import com.everis.quotation.respository.ServicioRepsoitory;
import com.everis.quotation.service.ClienteService;

@RestController
@RequestMapping("")
@ResponseBody
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ServicioRepsoitory servicioRespositoy;
	
	@Autowired
	private ComputeProxy computeProxy;
	
	@GetMapping("/clientes")
	public List<Cliente> listarCliente(){
		return clienteService.listarCliente();
	}
	@PostMapping("/cotizacion")
	public ComputeResponse cotizacion(@RequestBody ClienteResponse clienteResponse){
		ComputeResponse computeResponse = new ComputeResponse();
		QuotationResponse quotationResponse = new QuotationResponse();
		Cliente cliente = clienteRepository.findByidcliente(clienteResponse.getIdcliente());
		List<Servicio> servicios = new ArrayList<>();
		for (Integer idservicio : clienteResponse.getIdservicios()){	
			Servicio servicioBuscado = servicioRespositoy.findByidservicio(idservicio);
			servicios.add(servicioBuscado);
		}
		quotationResponse.setCliente(cliente);
		quotationResponse.setServicios(servicios);
		computeResponse = computeProxy.enviaConfirmacion(quotationResponse);
		return computeResponse;
	}
	
}
