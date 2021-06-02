package com.opencart.demo.qa.ui.components.desktop;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.demo.qa.ui.components.TopMenu;
import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.opencart.demo.qa.ui.pages.desktop.CategoryPageDesktop;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class TopMenuDesktop extends TopMenu {

	@FindBy(linkText = "Cameras")
	private ExtendedWebElement btnCameras;

	public TopMenuDesktop(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public CategoryPage clickCameras() {
		btnCameras.click();
		return new CategoryPageDesktop(getDriver());
	}

}
