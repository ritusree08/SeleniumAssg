Feature: Create New Opportunity on Salesforce Application

Background:

Given Open the chrome browser
And Load the Application URL and login
And go to global icon
And select Create Opportunity


Scenario: TC001_Create a new Opportunity with mandatory information

Given Enter new opportunity name "Oppurtunity 1"
And  Select account name
And Select stage
And select amount


When click on save 
