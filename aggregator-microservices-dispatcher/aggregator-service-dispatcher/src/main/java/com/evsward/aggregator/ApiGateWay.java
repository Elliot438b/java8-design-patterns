package com.evsward.aggregator;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGateWay {
	@Resource
	private ImageClient imageClient;
	@Resource
	private PriceClient priceClient;

	@RequestMapping("/desktop")
	public Product getProductDesktop() {
		Product product = new Product();
		product.setImagePath(imageClient.getImagePath());
		product.setPrice(priceClient.getPrice());
		return product;
	}

	@RequestMapping("/mobile")
	public Product getProductMobile() {
		Product product = new Product();
		product.setPrice(priceClient.getPrice());
		return product;
	}
}
