package com.everis.compute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.compute.model.Cliente;
import com.everis.compute.model.Configuracion;
import com.everis.compute.model.Cotizacion;
import com.everis.compute.model.Servicio;
import com.everis.compute.responses.ComputeResponse;
import com.everis.compute.responses.QuotationResponse;

@RestController
public class ComputeController {
	
	@Autowired
	Configuracion configuracion;
	
	@Autowired
	Cotizacion cotizacion;
	
	@GetMapping("/compute")
	public ComputeResponse compute(@RequestBody QuotationResponse quotation) {
		ComputeResponse computeResponse = new ComputeResponse();
		Cliente clienteSolicitado = quotation.getCliente();
		List<Servicio> serviciosSolicitados = quotation.getServicios();
		double descuentoPocentaje = 0;
		double subtotal = 0;
		double descuentoFinal = 0;
		
		if (quotation.getCliente().getTipocliente()==1) {
			descuentoPocentaje = Double.parseDouble(configuracion.getPrivado())/100;
		}
		else if (quotation.getCliente().getTipocliente()==2) {
			descuentoPocentaje = Double.parseDouble(configuracion.getGobierno())/100;
		}
		else if (quotation.getCliente().getTipocliente()==3) {
			descuentoPocentaje = Double.parseDouble(configuracion.getPreferente())/100;
		}
		
		for(Servicio servicio : serviciosSolicitados) {
			subtotal = subtotal + servicio.getPrecio();
			descuentoFinal = descuentoFinal + (servicio.getPrecio()*descuentoPocentaje);
		}
		
		double subtotalcondescuento = subtotal - descuentoFinal;
		double iva = subtotalcondescuento * 0.16;
		double total = subtotalcondescuento + iva;
		cotizacion.setSubtotal(subtotal);
		cotizacion.setDescuento(descuentoFinal);
		cotizacion.setSubtotalcondescuento(subtotalcondescuento);
		cotizacion.setIva(iva);
		cotizacion.setTotal(total);
		
		computeResponse.setCliente(clienteSolicitado);
		computeResponse.setServicios(serviciosSolicitados);
		computeResponse.setCotizacion(cotizacion);
		
		return computeResponse;
	}

}
