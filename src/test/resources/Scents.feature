Feature: Verify description under Areas of scenting in Scent application

@laks
Scenario: View description under Areas of scenting in Scent application
Given launch chrome browser maximize
When launch url of Scent application
And To click About us btn
And To scroll down to areas of scenting
And To click differnt arease(hotel ,office , Airport)
Then close the browser
