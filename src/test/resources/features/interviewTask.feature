Feature: hioscar.com care options web app testing

  @hiOscar
  Scenario:

    Given user goes to hiOscar homepage
    And user clicks Search network
    And user from Coverage year dropdown Selects "2023" option
    And user from Coverage access dropdown Selects "Employer-provided" option
    And user from Network partner dropdown Selects "Oscar" option
    And user from Coverage area dropdown Selects "New Jersey"
    And user clicks Continue button
    Then user verifies title contains "Oscar"