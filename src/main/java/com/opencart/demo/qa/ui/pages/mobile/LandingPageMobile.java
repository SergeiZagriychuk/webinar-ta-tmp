package com.opencart.demo.qa.ui.pages.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.demo.qa.ui.components.TopMenu;
import com.opencart.demo.qa.ui.components.mobile.TopMenuMobile;
import com.opencart.demo.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LandingPage.class)
public class LandingPageMobile extends LandingPage {

	@FindBy(css = "nav.navbar")
	private TopMenuMobile topMenuMobile;

	public LandingPageMobile(WebDriver driver) {
		super(driver);
	}

	@Override
	public TopMenu getTopMenu() {
		return topMenuMobile;
	}


}
