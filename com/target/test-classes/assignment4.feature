@automationpractice
Feature: CucumberJava- Registration of 10 users
Scenario: Registration of a user


Given Enter the user details and click on sign in button
|accountid|asdftyu@gmail.com|
|customer_firstname|firstname|
|customer_lastname|lastname|
|password|abc1234|
|firstname|firstname1|
|lastname|lastname1|
|address1|ds|
|city|des|
|postcode|12345|
|phone|1234567890|




Then Registration should be successful 