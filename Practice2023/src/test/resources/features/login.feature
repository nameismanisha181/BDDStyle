Feature: Login functionality

Scenario: Login with valid usename and password

Given Open login page
When  Enter userid and password
And   Click on login button
Then  Home page should be displayed