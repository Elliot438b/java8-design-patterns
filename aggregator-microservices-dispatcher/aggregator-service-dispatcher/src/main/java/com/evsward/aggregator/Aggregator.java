package com.evsward.aggregator;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aggregator {
	@Resource
	private ProductInformationClient informationClient;
	@Resource
	private ProductInventoryClient inventoryClient;

	@RequestMapping(value = "/product")
	public Product getProduct() {
		Product product = new Product();
		product.setInventory(inventoryClient.getProductInventories());
		product.setTitle(informationClient.getProductInformation());
		return product;
	}
}
