Feature: Test mail.ru

  Scenario: Test positive check search field mail.ru
    Given I am on main application page
    And I see mail logo
    And I am on search field
    And I enter the data
    And I click submit
    And I see page with news
    Then I make screenshot
    
  Scenario: Test positive check exists email address mail.ru
    Given I am on main application page
    And I see mail logo
    And I click on sing up
    And I enter email
    And I click registration
    And I see error info about existing
    Then I make screenshot