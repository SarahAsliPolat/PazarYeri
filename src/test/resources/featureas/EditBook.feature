Feature: Edit Book
  Agile Story: As a Librarian I should be able to edit books
  # Verify that the user can edit a book after it was created
  @editbook
  Scenario: Librarian should be able to edit on book info
    Given I am on the login page
    When user clicks the Books module
    And user tries to make edits
    Then user should be able to see info edited