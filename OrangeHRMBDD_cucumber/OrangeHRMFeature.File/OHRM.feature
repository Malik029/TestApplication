
Feature: OrangeHRM Application Functionalities Testing


Background:
Given User should launch chrome Browser

Scenario: Validating OrangeHRM Application LogIn Page Test


Given User should launch chrome Browser

When User should enter valid OrangeHRM Application Url Address

Then User should be navigated to OrangeHRM Application LogIn Page

Then User should be close the Browser along with the Application 

  
Scenario: Validating OrangeHRM Application LogIn Functionality Test
 
# Given User should launch chrome Browser

When User should enter valid OrangeHRM Application Url Address

Then User should be navigated to OrangeHRM Application LogIn Page

Then User should be close the Browser along with the Application 

When: User enters valid userName and valid password and click on LogIn button

Then: User should be navigated to OrangeHRM application home Page

Then: User should click on welcom Admin and click on LogOut

Then: User should be close the Browser along with the Application 

  
 Scenario Outline:
 
 
 # Given User should launch chrome Browser

When User should enter valid OrangeHRM Application Url Address

Then User should be navigated to OrangeHRM Application LogIn Page

Then User should be close the Browser along with the Application 

When: User enters  "<userName>" and "<password>" and click on LogIn button

Then: User should be navigated to OrangeHRM application home Page

Then: User should click on welcom Admin and click on LogOut

Then: User should be close the Browser along with the Application 
  
  
  
  

    Examples: 
      | userName     |  password      |
      | MdMaheboob05 |  MdMaheboob05@ |
      | MdMaheboob05@|  MMdMaheboob05@|  
      |  MdMaheboob05|  MdMaheboob05@ |
      
      
      
      
      
      
      
      
      
      
      
      
      