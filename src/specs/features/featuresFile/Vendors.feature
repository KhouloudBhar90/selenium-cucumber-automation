@Vendors
Feature: Ajout d un nouveau vendors
  Je souhaite tester le module vendors

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @Vendors
  Scenario: Remplir les infos du vendor
    When Je clique sur le menu Customers
    And Je clique sur le bouton Vendors
    And Je clique sur le bouton d ajout 
    And Je saisie le nom du vendeur "Vendor1"
    And Je saisie une description du vendeur "vendeur de chocolat" 
    And Je saisie son email "vendor1@gmail.com"
    And Je clique sur Active
    And Je clique sur Save
    Then Je recoie l alerte "For security purposes, the feature you have requested is not available on the demo site."
