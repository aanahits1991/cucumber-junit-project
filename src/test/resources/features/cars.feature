Feature: User should be able to buy his/her dream car

  Background:
    Given user on the main page


  Scenario: Cars order process

    When user clicks "Cars for Sale" option
    And user clicks New_used label and selects "New & used" option
    When user selects "Tesla" from Make label
    And user clicks on search button
    Then user should see "New and used Tesla for sale" header


  Scenario: Service & repair page
    When user clicks "Service & Repair" option


  Scenario: Test Grow With Cars link functionalities
   # When user clicks on grow with cars link
    Then verify Grow With Cars page header is displayed
      | We Are Cars.com                                |
      | The Leader In Powering Local Automotive Retail |


  @wi
  Scenario Outline: Test all Links all the cars.com footer
    Then user clicks on each link "<expectedLink>" and verifies page header "<expectedURL>" is displayed in the opened page

    Examples:

      | expectedLink   | expectedURL               |
      | Find a Car     | www.cars.com/shopping/    |
      | Find a Dealer  | www.cars.com/dealers/buy/ |
      | Grow with CARS | growwithcars.com/         |
      | Dealer Login   | dealerinspire.auth0.com/  |
