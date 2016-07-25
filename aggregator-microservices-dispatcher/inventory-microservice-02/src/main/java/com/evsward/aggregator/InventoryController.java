package com.evsward.aggregator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	@RequestMapping(value = "/inventories", method = RequestMethod.GET)
	public int getProductInventories() {
		return 20;
	}
}
