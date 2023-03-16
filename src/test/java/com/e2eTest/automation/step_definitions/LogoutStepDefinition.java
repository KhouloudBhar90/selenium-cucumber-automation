package com.e2eTest.automation.step_definitions;

//import org.junit.Assert;

import com.e2eTest.automation.page_objects.LogoutPage;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
	}

//	@When("Je clique sur le bouton Logout")
//	public void jeCliqueSurLeBoutonLogout() {
//		logoutPage.clickOnBtnLogout();
//	}
//	@Then("Je me redirige vers la page d authentification {string}")
//	public void jeMeRedirigeVersLaPageDAuthentification(String title) {
//		String title_page = LogoutPage.titlePage.getText();
//		Assert.assertEquals(title_page, title);
//	}

}
