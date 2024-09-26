@Feature1
Feature: To validate the login Functionality of flipkart application

@maha
Scenario: To validate login with invalid mobile number
Given To launch the chrome browser and maximize window
When To launch the url of the flipkart application
And To click login button
And To pass the invalid mobile number in mobile number field
And To click the Request OTP button
And To check whether navigate to the next page or not
Then To close the browser

@Sanity
Scenario Outline: To validate the login Functionality of GMail application
Given To launch the chrome browser and maximize window
And To launch the url of the EMail 
And To enter the phone numberin "<phonenumberDatas>" phone number field
And To click the next option
Then Close browser

Examples:
|phonenumberDatas|
|98745632100|
|9361847494|
|895489465548|
|894415674|
|68414894154|



