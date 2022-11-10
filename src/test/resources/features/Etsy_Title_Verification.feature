Feature:  Etsy Title Verification
  User Story: User sees title is as expected.

Background:
  Given user is on https://www.etsy.com

  @etsy
  Scenario: Title verification
    #Given user is on https://www.etsy.com
    Then user sees title is Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  @EtsySearch
Scenario: Etsy Search Functionality Title Verification (without parameterization)

#Given user is on https://www.etsy.com
When user types "Wooden Spoon" in the search box
And user clicks search button
Then user sees "Wooden Spoon" is in the title
