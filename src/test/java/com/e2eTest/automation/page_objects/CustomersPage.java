package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class CustomersPage {
	

	
	/* Retrieve Element of customer form*/
	
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement customers;

	
	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	public static WebElement customersField;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	public static WebElement btnAdd;
	
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement emailCustomer;
	
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement pwdCustomer;
	
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement firstName;
	
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement lastName;
	
	
	@FindBy(how = How.ID, using = "Gender_Female")
	public static WebElement gender;
	
	
	@FindBy(how = How.ID, using = "DateOfBirth")
	public static WebElement birthday;
	
	
	@FindBy(how = How.ID, using = "Company")
	public static WebElement companyName;
	
	
	@FindBy(how = How.ID, using = "IsTaxExempt")
	public static WebElement isTaxExempt;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-group-append']//div[@role='listbox']")
	public static WebElement newsletter;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	public static WebElement customerRole;
	
	
	@FindBy(how = How.ID, using = "VendorIdt")
	public static WebElement vendor;
	
	
	@FindBy(how = How.ID, using = "Active")
	public static WebElement active;
	
	
	@FindBy(how = How.ID, using = "AdminComment")
	public static WebElement comment;
	
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	public static WebElement btnSave;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[1]")
	public static WebElement message;
	
	public CustomersPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
}
