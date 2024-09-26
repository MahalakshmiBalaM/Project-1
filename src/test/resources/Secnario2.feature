Feature: Verify Navigate to Contact Us from Our Services
@laksh
Scenario: Navigate to "Contact Us" Page by clicking Contact Us btn from Our service
Given launch firefox browser maximize
When launch url of Scent website
And To click Our service btn
And To scroll down to contact us btn
And To click contact us btn
Then exit the browser
