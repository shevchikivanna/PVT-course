Feature: Test mail.ru

  Scenario: Test positive there is page mail.ru
    Given I am on main application page
    And I see mail logo
    Then I make screenshot
    
  Scenario: Test positive Login on mailru
    Given I am on main application page
    And I see mail logo
    And I enter login data
    Then I make screenshot
    And I log out
    
  Scenario: Test positive remove email to spam
    Given I am on main application page
    And I remove email to spam
    Then I make screenshot
    And I log out
  
  Scenario: Test positive create and send email
    Given I am on main application page
    And I create email and send email
    Then I make screenshot
    And I log out