
 Feature: Register funtionality 
@hh
 Scenario: Register with mandatory credential 
 Given User nevigate to registerr page
 When user enters below detail fields
| Firstname         |sagarrrr                   |
| LastName          |platforms                  |
| Email             |sagarr0123777@gmail.com    |
| Telephone         |4343434344                 |
| Password          |nikurre123465              |
And select privecy policy field 
And click on continue button 
Then account should get succesfully created


Scenario: Register with all credential 
Given User nevigate to registerr page
 When user enters below detail fields
| Firstname |saggarr                       |
| LastName  |nikuree                       |
| Email     |niikurreeesagar11200@gmail.com|
| Telephone |sagar123                      |
| Password  |7228742031                    |
And user select newsletter yes
And select privecy policy field 
And click on continue button 
Then account should get succesfully created

@duplicatecredential
Scenario: Register with duplicate credential
Given User nevigate to registerr page
 When user enters below detail fields
| Firstname |sagar                         |
| LastName  |nikure                        |
| Email     |niikurreeesagar11200@gmail.com|
| Telephone |Sagar@123                     |
| Password  |7428742031                    |
And user select newsletter yes
And select privecy policy field 
And click on continue button 
Then account should get proper warning massage duplicate email



Scenario: Register with without any credential 

Given User nevigate to registerr page
And user dont select any fields
And select privecy policy field 
And click on continue button 
Then account should get proper warning massage 

@h
Scenario: edit newly created account 
Given User navigate to login page 
When user enter valid email adress "sagarr0123777@gmail.com"
And user enter valid password "nikurre123465"
And click on login buttion 
Then user should login succesfully
Then user click on edit account field
Then user should navigate to my account information page 
When user updated name field "updated name sagar"
Then user click on continue button
Then newly created account should updated properly

@w777
Scenario: edit password and login again
Given User navigate to login page 
When user enter valid email adress "sagarr0123777@gmail.com"
And user enter valid password "1234"
And click on login buttion 
Then user should login succesfully
When user click on password field
Then user should nevigate to change password page 
When user enter new password in password field "3333"
And user re-enter new password in confirm password field "3333"
And user click on enter button
Then Password should updated successfully






