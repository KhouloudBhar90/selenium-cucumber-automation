package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.json.simple.JSONObject;

import com.e2eTest.automation.page_objects.VendorsPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorsStepDefinition {

	public VendorsPage vendorspage;
	private static SeleniumUtils seleniumUtils = new SeleniumUtils();
	static JSONObject object = seleniumUtils.JsonData(0);
	private static long mediumWait = Long.valueOf((String) object.get("MediumWait"));
	// private static long shortWait = Long.valueOf((String)
	// object.get("ShortWait"));
	// private static long highWait = Long.valueOf((String) object.get("HighWait"));
	public ConfigFileReader configFileReader;
	public Validations validation;
	private Wait wait;

	public VendorsStepDefinition() {
		vendorspage = new VendorsPage();
		validation = new Validations();
		configFileReader = new ConfigFileReader();
		wait = new Wait(Setup.getDriver());
	}

	@When("Je clique sur le menu Customers")
	public void jeCliqueSurLeMenuCustomers() {
		seleniumUtils.click(VendorsPage.customers);
	}

	@When("Je clique sur le bouton Vendors")
	public void jeCliqueSurLeBoutonVendors() {
		seleniumUtils.clickOnElementUsingJs(VendorsPage.vendors);
	}

	@When("Je saisie le nom du vendeur {string}")
	public void jeSaisieLeNomDuVendeur(String name) {
		seleniumUtils.writeText(VendorsPage.nameVendor, name);
	}

	@When("Je clique sur le bouton d ajout")
	public void jeCliqueSurLeBoutonDAjout() {
		seleniumUtils.clickOnElementUsingJs(VendorsPage.btnAddVendor);
	}

	@When("Je saisie une description du vendeur {string}")
	public void jeSaisieUneDescriptionDuVendeur(String desc) throws InterruptedException {
		Thread.sleep(mediumWait);
		wait.forElementToBeDisplayed(Duration.ofSeconds(10), VendorsPage.frameDescription, configFileReader.getProperties("frameid.vendors"));
		seleniumUtils.switchToNewWindow(Setup.getDriver(), configFileReader.getProperties("frameid.vendors"));
		seleniumUtils.writeText(VendorsPage.description, desc);
		seleniumUtils.switchToDefaultFrame();
	}

	@When("Je saisie son email {string}")
	public void jeSaisieSonEmail(String email) {
		seleniumUtils.writeText(VendorsPage.emailVendor, email);

	}

	@When("Je clique sur Active")
	public void jeCliqueSurActive() {
		seleniumUtils.click(VendorsPage.btnActiveVendor);

	}

	@When("Je clique sur Save")
	public void jeCliqueSurSave() {
		seleniumUtils.click(VendorsPage.btnSaveVendor);

	}

	@Then("Je recoie l alerte {string}")
	public void jeRecoieLAlerte(String alerte) {
		validation.assertTrue(VendorsPage.message, alerte);
	}

}
