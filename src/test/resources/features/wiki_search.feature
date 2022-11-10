Feature:  Wikipedia Search Functionality and Verifications

  Background:
    Given user is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification

 # Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title


  Scenario:  Wikipedia Search Functionality Header Verification

 #Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the main header
  #Note: Follow POM

  @scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT


    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in the main header

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bob Marley        | Bob Marley        |
      | Lady Gaga         | Lady Gaga         |
      | Cristiano Ronaldo | Cristiano Ronaldo |
