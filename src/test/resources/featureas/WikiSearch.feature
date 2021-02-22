Feature: Wiki title search verifications
  Background: User is on the Wiki home page
    Given User is on the etsy Wikipedia home page

    @wiki
    Scenario: Search functionality title verification
      When User search "Steve Jobs" in the wiki search page
      Then User should see "Steve Jobs" in the wiki title