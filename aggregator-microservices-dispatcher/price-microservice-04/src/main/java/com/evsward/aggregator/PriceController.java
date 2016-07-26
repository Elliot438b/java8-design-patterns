package com.evsward.aggregator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public String getPrice() {
		return "200";
	}
}
