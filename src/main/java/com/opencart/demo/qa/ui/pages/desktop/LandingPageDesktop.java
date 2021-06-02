package com.opencart.demo.qa.ui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.demo.qa.ui.components.TopMenu;
import com.opencart.demo.qa.ui.components.desktop.TopMenuDesktop;
import com.opencart.demo.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.DESKTOP, parentClass = LandingPage.class)
public class LandingPageDesktop extends LandingPage {

	@FindBy(css = "div.navbar-collapse")
	private TopMenuDesktop topMenuDesktop;

	public LandingPageDesktop(WebDriver driver) {
		super(driver);
	}

	@Override
	public TopMenu getTopMenu() {
		return topMenuDesktop;
	}


}
