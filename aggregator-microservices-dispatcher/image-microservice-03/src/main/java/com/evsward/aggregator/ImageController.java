package com.evsward.aggregator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	@RequestMapping(value = "/image-path", method = RequestMethod.GET)
	public String getImagePath() {
		return "/product-image.png";
	}
}
