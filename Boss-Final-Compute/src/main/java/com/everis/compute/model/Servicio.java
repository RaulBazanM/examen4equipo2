package com.everis.compute.model;
// Generated 8/10/2019 11:26:50 AM by Hibernate Tools 5.2.12.Final


/**
 * Servicio generated by hbm2java
 */

public class Servicio implements java.io.Serializable {

	private int idservicio;
	private String nombre;
	private Double precio;

	public Servicio() {
	}

	public Servicio(int idservicio) {
		this.idservicio = idservicio;
	}

	public Servicio(int idservicio, String nombre, Double precio) {
		this.idservicio = idservicio;
		this.nombre = nombre;
		this.precio = precio;
	}


	public int getIdservicio() {
		return this.idservicio;
	}

	public void setIdservicio(int idservicio) {
		this.idservicio = idservicio;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}