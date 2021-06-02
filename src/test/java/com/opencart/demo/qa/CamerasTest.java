package com.opencart.demo.qa;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.demo.qa.ui.components.Product;
import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.opencart.demo.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.AbstractTest;

public class CamerasTest extends AbstractTest {

	@Test
	public void testCameras() {
		LandingPage landingPage = initPage(getDriver(), LandingPage.class);
		landingPage.open();

		CategoryPage categoryPage = landingPage.getTopMenu().clickCameras();
		categoryPage.assertPageOpened();

		List<Product> products = categoryPage.getProducts();
		Assert.assertFalse(products.isEmpty(), "Products list is empty");
		products.stream().forEach(p -> p.logInfo());
		products.stream().forEach(p -> p.validateBaseElements());
		products.get(1).addProduct();
	}

}
