Feature: SmartBear


  Scenario: SmartBear order process

    Given user is logged into SmartBear Tester account and on Order page
    When user fills out the form as followed:
    And user selects FamilyAlbum from product dropdown
    And user enters "4" to quantity
    And user enters "John Wick" to costumer name
    And user enters "Kinzie Ave" to street
    And user enters "Chicago" to city
    And user enters "IL" to state
    And user enters "60056"
    And user selects "Visa" as card type
    And user enters "1111222233334444" to card number
    And user enters "12/22" to expiration date
    And user clicks process button
    Then user verifies "John Wick" is in the list