Feature: Login Functionality

#@regression

#Scenario: Verify the login functionality for valid credentials
    
#   Given User is on the login page
#   When user enters the username
#   And user enters teh password
#   And user clicks on the login button
#   Then user is navigated to home page 
    
#@Smoke

#Scenario: Verify the login functionality for invalid credentials
#    Given User is on the login page
#    When user enters the Invalid username
#    And user enters the Invalid password
#    Then an error message Invalid username and password should be displayed 

@sanity
Scenario Outline:Verify the login functionality for valid credentials using parameters
   Given User is on the login page
   When user enters the "<username>" and "<password>"
   And user clicks on the login button
   Then user is navigated to home page
   
   Examples:
   |username|password|
   |Admin|admin123|
   |Admin|admin123|
   |Admin|admin123|