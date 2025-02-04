
  Feature: Login funtion 
  
  @test1666666666666666
  Scenario Outline: Login with valid credential 
  Given User navigate to login page 
  When user enter valid email adress "sagarnikure00@gmail.com"
  And user enter valid password "sagar123"
  And click on login buttion 
  Then user should login succesfully
  
  @test1666666666666666
  @login @invalidcredentiaaaal @tt
  Scenario: Login with invalid credential 
  
  Given User navigate to login page 
  When user enter invalid email "sagarniku6re00@gmail.com"
  And user enter invalid password "sahar123"
  And click on login buttion 
  Then user should not login succesfully
  
  
  @notlogin @invalidcredentiaaaal
  Scenario: Login with valid email and invalid password 
  
  Given User navigate to login page 
  When  user enter valid email adress "sagarnikure00@gmail.com"
  And user enter invalid password "sahar123"
  And click on login buttion 
  Then user should not login succesfully 
  
  @notlogin @invalidcredentiaaaal
    Scenario: Login with invalid email and valid password 
  
  Given User navigate to login page 
  When  user enter invalid email "sagarniku6re00@gmail.com"
  And user enter valid password "sagar123"
  And click on login buttion 
  Then user should not login succesfully
  
  
  
  
  