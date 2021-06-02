package com.opencart.demo.qa.ui.pages.mobile;

import org.openqa.selenium.WebDriver;

import com.opencart.demo.qa.ui.pages.CategoryPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CategoryPage.class)
public class CategoryPageMobile extends CategoryPage {

	public CategoryPageMobile(WebDriver driver) {
		super(driver);
	}

}
