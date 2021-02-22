@order
Feature:SmartBear order process
  Scenario Outline: Order
    Given User is logged into SmartBear Tester account and on Order page
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer Name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to stateAnd User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expirationDate>" to expiration date
    And User clicks process button
    And User verifies "<expected name>" is in the list
#Pass the following table in Scenario outline.
    Examples:
      | product     | quantity | customer Name | street    | city    | state | zip   | cardType | card number  | expirationDate | expected name |
      | MyMoney     | 1        | Ken Adams     | Kinzie st | Chicago | IL    | 60004 | Visa     | 313131333111 | 12/22          | New order has been successfully added.     |
      | FamilyAlbum | 2        | Ken Adams1    | Kinzie st | Chicago | IL    | 60004 | AmericanExpress     | 313131333111 | 12/22          | New order has been successfully added.   |
      | ScreenSaver | 3        | Ken Adams2    | Kinzie st | Chicago | IL    | 60004 | Visa     | 313131333111 | 12/22          | New order has been successfully added.   |