package com.ashish.sprint.tutorials.currency.converter.proxy;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashish.sprint.tutorials.currency.converter.beans.CurrencyConversionBean;

//@FeignClient(name="forex-service", url="localhost:6002")
@FeignClient(name="forex-service")
@LoadBalancerClient(name = "forex-service",
configuration=LoadBalancerConfiguration.class)
public interface CurrencyExchangeServiceProxy {

	    @GetMapping("/currency-exchange/from/{from}/to/{to}")
	    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,
                                                 @PathVariable("to") String to);
}
