 
 Feature: addTocart
 
 @test2
 Scenario: User should able to add new searched product in cart
 Given User navigate to login page 
  When user enter valid email adress "sagarnikure00@gmail.com"
  And user enter valid password "sagar123"
  And click on login buttion 
  Then user should login succesfully
 When User enter valid product "HP"
 And user click on search button
 Then Valid product should get displayed in search result
 When user click on add to cart button 
 Then user should see available option
 And user select date from calender 
 And click on add to cart button
 Then product should be added succesfully 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 Scenario: User should able to removed added product from the cart
 Given user nevigate to search page
 When User enter valid product "HP"
 And user click on search button
 Then Valid product should get displayed in search result
 When user click on add to cart button 
 Then user should see available option
 And user select date from calender 
 And click on add to cart button
 Then product should be added succesfully 
 Then user click on cart icon
 And click on view cart option
 When user click on remove icon 
 Then product should removed succesfully
 