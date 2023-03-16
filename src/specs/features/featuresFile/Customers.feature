@customers
Feature: Je souhaite tester le module customers

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @customers_Info
  Scenario: Remplir les informations de clientele sur l application nopcommerce
    When Je clique sur le bouton Customers
    And Je clique sur le bouton Sous Menu Customers
    And Je clique sur le bouton Add new
    And Je saisis l email de formulaire Customers "bharkhouloud16@gmail.com"
    And Je saisis le Password de formulaire Customers "admin"
    And Je saisis le FirstName "BHAR"
    And Je saisis le LastName "Khouloud"
    And Je clique sur le bouton Female
    And Je saisis la date de naissance de customers "16/03/1990"
    And Je choisis le nom de l entreprise "NEOXAM"
    And J active Is tax exempt
    And Je choisis le Newsletter "Your" "Your store name"
    And Je choisis le Customers Roles "Gu" "Guests"
    And Je choisis le Manage of vendor "Vendor 1"
    And J active le customer
    And Je saisie un commentaire "Customer form has been filled"
    When Je clique sur le bouton Save
    Then Je verifie le message succes "The new customer has been added successfully."
    And Je clique sur le bouton Logout
