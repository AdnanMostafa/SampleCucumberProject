#Feature 

@tag
Feature: Feature to test google search functionality
  I want to use this template for my feature file

	@tag1
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
    
    @tag2
    Scenario Outline: Validate google search is working 2
    Given the user enters the <username>
    And the user enters the <password>
    Then they can click on login button
    
    | username | password |
    |john | pass123|
    |bob| pass324232|
    |charlie| pass3|
    
Feature: Feature to test yahoo search functionality

