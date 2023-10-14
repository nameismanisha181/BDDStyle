Feature: Login functionality

Scenario Outline:  User is logged in to application

Given  User is on home page 
When   Enter <id> and <password>
Then   Click on Login button

Examples: 

|id|password|
|admin|manager|
|trainee|trainee|
