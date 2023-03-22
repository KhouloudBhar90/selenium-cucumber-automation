package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class VendorsPage {

	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement customers;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Vendors')]")
	public static WebElement vendors;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	public static WebElement btnAddVendor;
	
	@FindBy(how = How.ID, using = "Name")
	public static WebElement nameVendor;
	
	@FindBy(how = How.ID, using = "Description_ifr")
	public static WebElement frameDescription;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tinymce']/p")
	public static WebElement description;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement emailVendor;
	
	@FindBy(how = How.ID, using = "Active")
	public static WebElement btnActiveVendor;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	public static WebElement btnSaveVendor;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger alert-dismissable']")
	public static WebElement message;
	
	
	public VendorsPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

}
