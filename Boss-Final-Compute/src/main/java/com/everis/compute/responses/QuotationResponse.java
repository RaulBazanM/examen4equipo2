package com.everis.compute.responses;

import java.util.List;

import com.everis.compute.model.Cliente;
import com.everis.compute.model.Servicio;

public class QuotationResponse {
	private Cliente cliente;
	private List<Servicio> servicios;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
}
