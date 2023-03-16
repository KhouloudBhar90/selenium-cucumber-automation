package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthetificationStepDefinition {

	public AuthentificationPage authentificationPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validation;
	
	public AuthetificationStepDefinition() {
		authentificationPage = new AuthentificationPage();
		seleniumUtils = new SeleniumUtils();
		validation = new Validations();
		configFileReader = new ConfigFileReader();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.email, email);
	}

	@And("Je saisis le Password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(AuthentificationPage.password, password);
	}

	@And("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		seleniumUtils.click(AuthentificationPage.btnLogin);
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		validation.assertEquals(AuthentificationPage.titlePage, title);
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		seleniumUtils.click(AuthentificationPage.btnLogout);
	}
	@Then("Je me redirige vers la page d authentification {string}")
	public void jeMeRedirigeVersLaPageDAuthentification(String title) {
		validation.assertEquals(AuthentificationPage.titlePage, title);
	}

}
