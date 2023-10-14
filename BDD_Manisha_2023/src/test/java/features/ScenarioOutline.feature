Feature: Data Parameterization 

Background: User is login to application 

Given Enter AUT url

@ScenarioOutline
Scenario Outline: Verify data parameterization using scenario outline

When Enter "<id>" and "<password>"
Then Hit Login button

Examples: 
|id|password|
|admin|manager|
|trainee|trainee|
