package com.everis.quotation.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.quotation.response.ComputeResponse;
import com.everis.quotation.response.QuotationResponse;

@FeignClient(name="examen4")
@RibbonClient (name="examen4")
public interface ComputeProxy {
	
	@GetMapping("/cotizacion")
	public 	ComputeResponse enviaConfirmacion(@RequestBody QuotationResponse quotation);
}
