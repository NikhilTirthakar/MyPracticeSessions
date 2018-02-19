@Testing
Feature: Facebook Project
	I want to use this template for my feature file

@TestCase1
Scenario Outline: Login scenario
Given Opening the Application
When  Phone Number or Mobile Number in <Username> field
When  Password in <Password> field
Then  Click on the Login_button for Login the Application

	
Examples:

    |Username |Password | 
    |nikhil.tirthakar@gmail.com | nikhil| 
    |nikhil_tirthakar@rediff.com | kartik| 