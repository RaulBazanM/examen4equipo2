package com.everis.compute.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Configuracion {
	
	private String gobierno;
	private String privado;
	private String preferente;
	public String getGobierno() {
		return gobierno;
	}
	public void setGobierno(String gobierno) {
		this.gobierno = gobierno;
	}
	public String getPrivado() {
		return privado;
	}
	public void setPrivado(String privado) {
		this.privado = privado;
	}
	public String getPreferente() {
		return preferente;
	}
	public void setPreferente(String preferente) {
		this.preferente = preferente;
	}
	

	
	

}
