package com.everis.quotation.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.quotation.response.ComputeResponse;
import com.everis.quotation.response.QuotationResponse;

@FeignClient(name="EXAMEN4")
@RibbonClient (name="EXAMEN4")
public interface ComputeProxy {
	
	@PostMapping("/compute")
	public 	ComputeResponse enviaConfirmacion(@RequestBody QuotationResponse quotation);
}
