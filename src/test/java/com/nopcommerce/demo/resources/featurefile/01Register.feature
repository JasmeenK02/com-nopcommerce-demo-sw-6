Feature: Register Test

  As a user I want to register to nopCommerce website


  @smoke, @regression
  Scenario: User should navigate to register page successfully
    Given I am on home page
    When I click on register link
    Then Register text is displayed

  @sanity, @regression
  Scenario: Verify that first name, last name, email, password, and confirm password fields are mandatory
    Given I am on home page
    When I click on register link
    And I click on register button
    And I should see First name is required
    And I should see Last name is required
    And I should see Email is required
    And I should see Password is required
    Then I should see Confirm password is required

  @regression
  Scenario: Verify user should create account successfully
    Given I am on home page
    When I click on register link
    And I select gender "Female"
    And I enter first name "Jasmeen"
    And I enter last name "Kaur"
    And I select day "05"
    And I select month "November"
    And I select year "1985"
    And I enter email in register page "jasmeen144kr@gmail.com"
    And I enter password in register page "jask1234"
    And I enter confirm password "jask1234"
    And  I click on register button button
    Then I should see registration message completed message