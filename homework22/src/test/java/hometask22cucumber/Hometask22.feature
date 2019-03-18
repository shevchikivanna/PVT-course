Feature: Test hometask22 page

  Scenario: Test positive there is list of hotels
    Given I am on main application page
    When I enter city name
    And I enter first date
    And I enter end date
    And I enter adult
    And I enter room
    Then I see list of hotels
         
  Scenario: Check rating of the first hotel
    Given I am on main application page
    When I enter city name
    And I enter first date
    And I enter end date
    And I enter adult
    And I enter room
    And I sort hotel
   Then I see and check the rating of hotel 

