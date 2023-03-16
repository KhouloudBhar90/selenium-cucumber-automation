@logout
Feature: Déconnection de logout de l application nopcommerce
  En tant que utilisateur, je souhaite se déconnecter

  @logout
  Scenario: Déconnexion de l applicaion nopcommerce 
    When Je clique sur le bouton Logout
    Then Je me redirige vers la page d authentification "Admin area demo"