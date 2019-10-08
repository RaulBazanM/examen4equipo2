package com.everis.quotation.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.quotation.model.Cliente;
import com.everis.quotation.model.Servicio;

@Repository
public interface ServicioRepsoitory extends JpaRepository<Servicio, Integer>{
	public Servicio findByidservicio(Integer idservicio);

}
