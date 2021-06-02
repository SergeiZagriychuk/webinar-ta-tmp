package com.opencart.demo.qa.ui.components;

import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Product extends AbstractUIObject {

	private final static Logger LOGGER = Logger.getLogger(Product.class);

	@FindBy(css = "img.img-responsive")
	private ExtendedWebElement img;

	@FindBy(css = "h4 > a")
	private ExtendedWebElement title;

	@FindBy(xpath = ".//p[@class='price']/span[@class='price-new'] | .//p[@class='price' and not(./span[@class='price-new'])]")
	private ExtendedWebElement price;

	@FindBy(xpath = ".//button[contains(.,'Add to Cart')]")
	private ExtendedWebElement btnAdd;

	public Product(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public void validateBaseElements() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(img.isVisible(), "Image is missing");
		softAssert.assertTrue(title.isVisible(), "Title is missing");
		softAssert.assertFalse(title.getText().isEmpty(), "Title is empty");
		softAssert.assertTrue(price.isVisible(), "Price is missing");
		softAssert.assertFalse(price.getText().isEmpty(), "Price is empty");
		softAssert.assertTrue(btnAdd.isVisible(), "Add button is missing");
		softAssert.assertAll();
	}

	public void addProduct() {
		btnAdd.click();
	}

	public void logInfo() {
		LOGGER.debug(String.format("Product %s with price %s was found", title.getText(), price.getText()));
	}

}
