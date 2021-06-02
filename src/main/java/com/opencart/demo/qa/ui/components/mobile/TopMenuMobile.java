package com.opencart.demo.qa.ui.components.mobile;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.demo.qa.ui.components.TopMenu;
import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.opencart.demo.qa.ui.pages.mobile.CategoryPageMobile;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class TopMenuMobile extends TopMenu {

	@FindBy(css = "button.btn-navbar")
	private ExtendedWebElement btnExpandMenu;

	@FindBy(linkText = "Cameras")
	private ExtendedWebElement btnCameras;

	public TopMenuMobile(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public CategoryPage clickCameras() {
		btnExpandMenu.click();
		btnCameras.click();
		return new CategoryPageMobile(driver);
	}

}
