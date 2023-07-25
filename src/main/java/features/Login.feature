Feature: Login functionality of Leaftaps Application

Background:
Given Open the browser
And Load the url

Scenario: Login for Positive testCase
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
  
Scenario: Login for invaild Credential
Given Enter the username as 'DemoCSR1'
And Enter the password as 'crmsfa'
When Click on Login button
But ErrorMessage should be displayed
  
  