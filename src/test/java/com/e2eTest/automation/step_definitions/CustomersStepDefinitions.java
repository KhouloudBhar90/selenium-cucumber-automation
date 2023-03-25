package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.CustomersPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
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
		seleniumUtils.click(customerspage.getCustomerWrappedElement(customerspage.getCustomerIcon()));
	}

	@When("Je clique sur le bouton Sous Menu Customers")
	public void jeCliqueSurLeBoutonSousMenuCustomors() {
		seleniumUtils.clickOnElementUsingJs(customerspage.getCustomerWrappedElement(customerspage.getCustomerBtn()));
	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(customerspage.getCustomerWrappedElement(customerspage.getAddNewBtn()));
	}

	@When("Je saisis l email de formulaire Customers {string}")
	public void jeSaisisLEmailDeFormulaireCustomers(String email) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getEmail()), email);
	}

	@When("Je saisis le Password de formulaire Customers {string}")
	public void jeSaisisLePasswordDeFormulaireCustomers(String pwd) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getPassword()), pwd);
	}

	@When("Je saisis le FirstName {string}")
	public void jeSaisisLeFirstName(String first) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getFirstName()), first);

	}

	@When("Je saisis le LastName {string}")
	public void jeSaisisLeLasttName(String last) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getLastName()), last);

	}

	@When("Je clique sur le bouton Female")
	public void jeCliqueSurLeBoutonFemale() {
		seleniumUtils.click(customerspage.getCustomerWrappedElement(customerspage.getGenderFemale()));
	}

	@When("Je saisis la date de naissance de customers {string}")
	public void jeSaisisLaDateDeNaissanceDeCustomers(String date) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getDateOfBirth()), date);
	}

	@When("Je choisis le nom de l entreprise {string}")
	public void jeChoisisLeNomDeLEntreprise(String compName) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getCompany()), compName);

	}

	@When("J active Is tax exempt")
	public void jActiveIsTaxExempt() {
		seleniumUtils.click(customerspage.getCustomerWrappedElement(customerspage.getIsTaxExempt()));
	}

	@When("Je choisis le Newsletter {string} {string}")
	public void jeChoisisLeNewsletter(String writeText, String textToSelect) throws InterruptedException  {
		seleniumUtils.autoSuggest(customerspage.getCustomerWrappedElement(customerspage.getNewsLetter()),writeText , textToSelect);
		
	}

	@When("Je choisis le Customers Roles {string} {string}")
	public void jeChoisisLeCustomersRoles(String txt, String select) throws InterruptedException {
		seleniumUtils.autoSuggest(customerspage.getCustomerWrappedElement(customerspage.getCustomerRoles()), txt, select);
	}

	@When("Je choisis le Manage of vendor {string}")
	public void jeChoisisLeManageOfVendor(String vendor) {
		selectFromListUtils.selectDropDownListByVisibleText(customerspage.getCustomerWrappedElement(customerspage.getManagerOfVender()), vendor);
	}

	@When("Je saisie un commentaire {string}")
	public void jeSaisieUnCommentaire(String comm) {
		seleniumUtils.writeText(customerspage.getCustomerWrappedElement(customerspage.getAdminComment()), comm);
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(customerspage.getCustomerWrappedElement(customerspage.getSaveBtn()));	}

	@Then("Je verifie le message succes {string}")
	public void jeVerifieLeMessageSucces(String title) {
		validation.assertTrue(customerspage.getCustomerWrappedElement(customerspage.getnewCustomer()), title);
	}

}
