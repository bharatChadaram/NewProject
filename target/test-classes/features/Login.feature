Feature: Application Login


Scenario Outline: Application login
Given I am at Landingpage
And click "https://www.aha.video/"
When user login into application with  <username> and  <password>
Then Homepage should be displayed
And close Browsers

Examples:
|username                               |password    |
|bharat                                 |bharat      |
|bharat1                                |bharat1     |
|bhaskarchadaram369@gmail.com           |Aha@1234    |





