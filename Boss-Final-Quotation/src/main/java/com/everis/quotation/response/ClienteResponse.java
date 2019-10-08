package com.everis.quotation.response;

import java.util.List;

import com.everis.quotation.model.Cliente;

public class ClienteResponse {

	private boolean successful;
	private int idcliente;
	private List<Integer> idservicios;
	
	
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public List<Integer> getIdservicios() {
		return idservicios;
	}
	public void setIdservicios(List<Integer> idservicios) {
		this.idservicios = idservicios;
	}
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	
}
