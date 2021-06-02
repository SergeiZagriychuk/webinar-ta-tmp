package com.opencart.demo.qa.ui.pages;

import org.openqa.selenium.WebDriver;

import com.opencart.demo.qa.ui.components.TopMenu;
import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		super(driver);
		setPageURL("");
	}

	public abstract TopMenu getTopMenu();

}
