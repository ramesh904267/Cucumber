Feature: Login functionality of Leaftaps Application

Background:
Given Open the browser and launch leaftaps application using 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: Login for Positive testCase
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crmsfa link
When Click Leads Link
And Click CreateLead Link
Given Enter the companyName as <companyName>
And Enter the firstName as <firstName>
And Enter the lastName as <LastName>
When Click on CreateLead Button 
Then ViewLeadsPage should be displayed

Examples:
|companyName|firstName|LastName|
|TestLeaf|Ramesh|s|
|Qeagle|Vicky|R|
