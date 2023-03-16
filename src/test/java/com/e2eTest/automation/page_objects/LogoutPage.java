package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage {

	private ConfigFileReader configFileReader;

	/* Retrieve Element */

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Admin area demo')]")
	public static WebElement titlePage;

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	/* Create method */


	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void clickOnBtnLogout() {
		btnLogout.click();
	}

}
