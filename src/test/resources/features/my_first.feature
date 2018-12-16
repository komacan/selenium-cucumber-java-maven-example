Feature: GoogleSearch
        As a user I should able to search in google homepage
 
 Scenario: I search for tomsmith
 		Given I navigate to "http://www.google.com"
        And I enter "tomsmith" into input field
        When I click search
        Then I should get results for "tomsmith"
 