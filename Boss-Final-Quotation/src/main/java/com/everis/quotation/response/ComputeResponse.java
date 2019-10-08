package com.everis.quotation.response;

import java.util.List;

import com.everis.quotation.model.Cliente;
import com.everis.quotation.model.Cotizacion;
import com.everis.quotation.model.Servicio;

public class ComputeResponse {
	
	private Cliente cliente;
	private List<Servicio> servicios;
	private Cotizacion cotizacion;
	
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
	public Cotizacion getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	
	

}
