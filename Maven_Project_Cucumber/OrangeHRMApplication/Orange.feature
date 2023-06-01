Feature: OrangeHRM Application Functionalities Testing


Background: 
Given User should launch chrome Browser
     
@Ali
Scenario: Validating OrangeHRM Application LogIn Page Test

When User should enter valid OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should be close the Browser along with the Application 
@Ali @Pasha
Scenario: Validating OrangeHRM Application LogIn Home Page Test

When User should enter valid OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then entervalid userName and valid password and Click on LogInButton
Then User navigate the OrangeHRM Apllication Home Page and LogOut
Then User should be close the Browser along with the Application
 @Pasha @Malik @MD
 Scenario Outline: Validating OrangeHRM Application LogIn Home Page Test

When User should enter valid OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then enter "<userName>" and "<password>" and Click on LogInButton
Then User should be close the Browser along with the Application
 
 
Examples: 
       | userName   | password  |
       | MdMahaboob05 | MdMahaboob05@ |
       | MdMahebob05  | MdMaheboob05@ |
        
