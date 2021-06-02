package com.opencart.demo.qa.ui.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.DESKTOP, parentClass = CategoryPage.class)
public class CategoryPageDesktop extends CategoryPage {

	public CategoryPageDesktop(WebDriver driver) {
		super(driver);
	}

}
