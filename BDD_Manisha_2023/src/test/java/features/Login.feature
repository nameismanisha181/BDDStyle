Feature: Login feature

Background: User is login to application 

Given User is on home page
When User enter id and password
Then Click on Login button

@smoke
Scenario: Verification of user tab

Given User is on Home page.Click on users tab
When  Add new user
Then  New user should get added on page


@regression
Scenario: Verification of tasks tab

Given User is on Home page. Click on Taks tab
When  Add Task
Then  Task should get added to page

@ignore
Scenario: Verification of logout button

Given User is on Home page
When  Verify logout button
Then  Logout button should be present