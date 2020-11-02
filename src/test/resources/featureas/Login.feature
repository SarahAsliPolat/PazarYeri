Feature: As user I want to be able to login

  @login
  Scenario: Login as a librarian
    Given user is on the login page
    When user logs in
    Then user should see home page

