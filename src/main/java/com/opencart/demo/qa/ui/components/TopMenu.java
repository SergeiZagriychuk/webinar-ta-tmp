package com.opencart.demo.qa.ui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public abstract class TopMenu extends AbstractUIObject {

	public TopMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public abstract CategoryPage clickCameras();

}
