package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class CustomersPage {
	

	
	/* Retrieve Element of customer form*/
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement customers;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	public static WebElement customersField;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	public static WebElement btnAdd;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Email")
	public static WebElement emailCustomer;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Password")
	public static WebElement pwdCustomer;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement firstName;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement lastName;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Gender_Female")
	public static WebElement gender;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "DateOfBirth")
	public static WebElement birthday;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Company")
	public static WebElement companyName;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "IsTaxExempt")
	public static WebElement isTaxExempt;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[@class='input-group-append']//div[@role='listbox']")
	public static WebElement newsletter;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	public static WebElement customerRole;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "VendorIdt")
	public static WebElement vendor;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Active")
	public static WebElement active;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "AdminComment")
	public static WebElement comment;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	public static WebElement btnSave;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[1]")
	public static WebElement message;
	
	public CustomersPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
}
