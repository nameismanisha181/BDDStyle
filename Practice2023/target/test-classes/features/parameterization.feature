Feature: Login functionality

@smoke
Scenario: Login with valid usename and password

Given Open login page
When  Enter userid and password
And   Click on login button
Then  Home page should be displayed

Examples:
|Userid   |password    |
|user1    |pass1       |
|user2    |pass2       |