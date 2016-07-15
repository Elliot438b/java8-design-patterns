package com.evsward.abstract_document;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.evsward.adstract_document.domain.HasModel;
import com.evsward.adstract_document.domain.HasWoods;
import com.evsward.adstract_document.domain.Part;
import com.evsward.adstract_document.domain.WoodenHouse;

public class DocumentTest {
	private static final long TEST_PART_WOODS = 200L;
	private static final String TEST_PART_MODEL = "test-part-model";
	private static final long TEST_HOUSE_WOODS = 1000L;
	private static final String TEST_HOUSE_MODEL = "test-house-model";

	@Test
	public void shouldConstructPart() {
		Map<String, Object> partProperties = new HashMap<>();
		partProperties.put(HasModel.PROPERTY, TEST_PART_MODEL);
		partProperties.put(HasWoods.PROPERTY, TEST_PART_WOODS);
		Part part = new Part(partProperties);

		assertEquals(TEST_PART_MODEL, part.getModel().get());
		assertEquals(TEST_PART_WOODS, part.getWoods().get());
	}

	@Test
	public void shouldConstructHouse() {
		Map<String, Object> houseProperties = new HashMap<>();
		houseProperties.put(HasModel.PROPERTY, TEST_HOUSE_MODEL);
		houseProperties.put(HasWoods.PROPERTY, TEST_HOUSE_WOODS);
		WoodenHouse house = new WoodenHouse(houseProperties);

		assertEquals(TEST_HOUSE_MODEL, house.getModel().get());
		assertEquals(TEST_HOUSE_WOODS, house.getWoods().get());
	}
}
