@smoke_test

@authentification
Feature: Authentification de login de l application nopcommerce
  En tant que utilisateur, je souhaite naviger

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @login_page
  Scenario: Authentification sur l applicaion nopcommerce
    Then Je me redirige vers la page home "Dashboard"

  @logout_page
  Scenario: Je souhaite me deconnecter de l applicaion Nopcommerce
    When Je clique sur le bouton Logout
    Then Je me redirige vers la page d authentification "Admin area demo"
