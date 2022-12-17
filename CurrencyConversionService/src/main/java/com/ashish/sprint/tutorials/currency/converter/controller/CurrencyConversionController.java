package com.ashish.sprint.tutorials.currency.converter.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashish.sprint.tutorials.currency.converter.beans.CurrencyConversionBean;
import com.ashish.sprint.tutorials.currency.converter.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	  @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
	      @PathVariable BigDecimal quantity) {
		 LOGGER.info("{..................}",from, to);

	    CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);

	    LOGGER.info("{}", response);

	    return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
	        quantity.multiply(response.getConversionMultiple()), response.getPort());
	  }

}
