package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.By;

import com.e2eTest.automation.page_objects.CustomersPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersStepDefinitions {

	public CustomersPage customerspage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validation;
	public SelectFromListUtils selectFromListUtils;

	public CustomersStepDefinitions() {
		customerspage = new CustomersPage();
		seleniumUtils = new SeleniumUtils();
		validation = new Validations();
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
	}

	@When("Je clique sur le bouton Customers")
	public void jeCliqueSurLeBoutonCustomers() {
		seleniumUtils.click(CustomersPage.customers);;
	}

	@When("Je clique sur le bouton Sous Menu Customers")
	public void jeCliqueSurLeBoutonSousMenuCustomors() {
		seleniumUtils.click(CustomersPage.customersField);
	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CustomersPage.btnAdd);
	}

	@When("Je saisis l email de formulaire Customers {string}")
	public void jeSaisisLEmailDeFormulaireCustomers(String email) {
		seleniumUtils.writeText(CustomersPage.emailCustomer, email);
	}
	
	@When("Je saisis le Password de formulaire Customers {string}")
	public void jeSaisisLePasswordDeFormulaireCustomers(String pwd) {
		seleniumUtils.writeText(CustomersPage.pwdCustomer, pwd);
	}

	@When("Je saisis le FirstName {string}")
	public void jeSaisisLeFirstName(String first) {
		seleniumUtils.writeText(CustomersPage.firstName, first);
	}

	@When("Je saisis le LastName {string}")
	public void jeSaisisLeLasttName(String last) {
		seleniumUtils.writeText(CustomersPage.lastName, last);
	}

	@When("Je clique sur le bouton Female")
	public void jeCliqueSurLeBoutonFemale() {
		seleniumUtils.click(CustomersPage.gender);
	}

	@When("Je saisis la date de naissance de customers {string}")
	public void jeSaisisLaDateDeNaissanceDeCustomers(String date) {
		seleniumUtils.writeText(CustomersPage.birthday, date);
	}

	@When("Je choisis le nom de l entreprise {string}")
	public void jeChoisisLeNomDeLEntreprise(String compName) {
		seleniumUtils.writeText(CustomersPage.companyName, compName);
	}

	@When("J active Is tax exempt")
	public void jActiveIsTaxExempt() {
		seleniumUtils.click(CustomersPage.isTaxExempt);
	}

	@When("Je choisis le Newsletter {string} {string}")
	public void jeChoisisLeNewsletter(String writeText, String textToSelect) throws InterruptedException {
		seleniumUtils.autoSuggest(CustomersPage.newsletter, textToSelect, textToSelect);
		
	}

	@When("Je choisis le Customers Roles {string} {string}")
	public void jeChoisisLeCustomersRoles(String txt, String select) throws InterruptedException {
		seleniumUtils.autoSuggest(CustomersPage.customerRole, txt, select);
	}

	@When("Je choisis le Manage of vendor {string}")
	public void jeChoisisLeManageOfVendor(String vendor) {
		selectFromListUtils.selectDropDownListByVisibleText(CustomersPage.vendor, vendor);
	}

	@When("J active le customer")
	public void jActiveLeCustomer() {
		seleniumUtils.click(CustomersPage.active);
	}

	@When("Je saisie un commentaire {string}")
	public void jeSaisieUnCommentaire(String comm) {
		seleniumUtils.writeText(CustomersPage.comment, comm);
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CustomersPage.btnSave);
	}

	@Then("Je verifie le message succes {string}")
	public void jeVerifieLeMessageSucces(String title) {
		validation.assertEquals(CustomersPage.message, title);
	}

}
