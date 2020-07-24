@login
Feature: Login feature
  CBT-25: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed

  # this is how you comment in feature file

  @librarian      #hatirlayacagin isim veya isimler verebilirsin
  Scenario: User login scenario
    Given User is on the login page
    Then User should see dashboard