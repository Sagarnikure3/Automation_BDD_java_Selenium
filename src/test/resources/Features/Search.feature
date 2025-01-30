@all
Feature: Search funtionality

Scenario: Search with valid  product 
 Given user nevigate to search page
 When User enter valid product "HP"
 And user click on search button
 Then Valid product should get displayed in search result
 

 Scenario: Search for non existing product into search field
 Given user nevigate to search page 
 When User enter non existing product "Honda"
 And user click on search button
 Then Proper massage should get to user informing no such product 
 
Scenario: Search without any input in search field
Given user nevigate to search page
When user dont enter any product on search field
Then User should get proper massage 