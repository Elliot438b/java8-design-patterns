package com.evsward.abstract_document;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.evsward.adstract_document.domain.HasModel;
import com.evsward.adstract_document.domain.HasParts;
import com.evsward.adstract_document.domain.HasWoods;
import com.evsward.adstract_document.domain.WoodenHouse;

public class App {
	public App() {
		System.out.println("constructing wooden house.");

		Map<String, Object> houseProperties = new HashMap<>();
		houseProperties.put(HasModel.PROPERTY, "Forest Villa");
		houseProperties.put(HasWoods.PROPERTY, 3000L);

		Map<String, Object> bedroomProperties = new HashMap<>();
		bedroomProperties.put(HasModel.PROPERTY, "main bedroom");
		bedroomProperties.put(HasWoods.PROPERTY, 300L);

		Map<String, Object> livingroomProperties = new HashMap<>();
		livingroomProperties.put(HasModel.PROPERTY, "room for visitors");
		livingroomProperties.put(HasWoods.PROPERTY, 500L);

		houseProperties.put(HasParts.PROPERTY, Arrays.asList(bedroomProperties, livingroomProperties));

		WoodenHouse house = new WoodenHouse(houseProperties);

		System.out.println("Here is our little wooden house:");
		System.out.println("->house model: " + house.getModel().get());
		System.out.println("->cost woods: " + house.getWoods().get());
		// java 8 new feature: a list has a easy function {forEach} instead of the for loops.
		house.getParts().forEach(p -> System.out.println("\t" + p.getModel().get() + "/" + p.getWoods().get()));
	}

	public static void main(String[] args) {
		new App();
	}
}
