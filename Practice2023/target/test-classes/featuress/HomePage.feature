Feature: Login functionality

Background: User is logged in to application

Given  User is on home page 
When   Enter id and password
Then   Click on Login button

@smoke
Scenario:  Valid id and password

When  Click on user tab
Then  User page should be displayed

@regression
Scenario:  invalid id and password

When  Click on logout
Then  User should get logged out
