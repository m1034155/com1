Feature: CucumberJava

@flight @airasia
Scenario: Creating a Feature file and step definitions file for following scenario of the site 

Given Open the  site URL


And Enter the below details and click on search button
|origin|Bengaluru|
|Destination|Pune|
|date|18/04/2019|


Then I should be navigated successfully to search flight page

@login @airasia
Scenario: Login Validation

Given Open the  site URL

And Enter the below details and click on login button
|username|a@gmail.com|
|password|India1234|

Then Login unsuccessful message should be displayed



