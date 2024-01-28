Feature: Login Page Functionality

  As a user of SawgLabs website
  I want to login to the website
  so that i can access and manage my account

  Background:
    Given I am on Login page of SwagLabs Website

    Scenario: Successful Login with valid credentials
      Given  I have entered a valid  username and password
      When I click on login button
      Then I will be able to logged in sucessfully

      Scenario Outline:  Unsuccessful Login with invalid credentials
        Given I have entered invalid "<username>" and "<password>"
        When I click on login button
        Then I should see a error message indicating "<errorMessage>"

        Examples:

          | username      | password | error_message                                                             |
          | demo@test.com | 232434   | Epic sadface: Username and password do not match any user in this service |
          | test@g.com    | 454fdgdf | Epic sadface: Username and password do not match any user in this service |



