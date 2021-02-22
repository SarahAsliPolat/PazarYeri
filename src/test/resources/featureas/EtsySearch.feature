Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see
  relevant result in the page an in the title.

  Background: User is on the esty home page
    Given User is on the etsy home page

  @etsyWip
  Scenario: Title verification
    Then User should see title is as expected
    #expected : Etsy - Shop for handmade, vintage,custom, and unique gifts for everyone

  Scenario: Title verification after search term
   When User searches "wooden spoon"in the search box
    And User click search button
    Then User should see "wooden spoon" in the Etsy title



