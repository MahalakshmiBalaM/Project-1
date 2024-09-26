@Feature2
Feature: To validate the accout creation of the Facebook Application

Scenario: To create new account

Given To launch the browser and maximize the window

When To launch url of facebook application

And To click the create new account

And To pass the firstname in first text box

#with header ------> ONE DIMENSIONAL MAP

|firstname1|maha|
|firstname2|lakshmi|
|firstname3|sanjay|
|firstname4|ganesh|

#without header -------> ONE DIMENSIONAL LIST

#|maha|lakshu|sanjay|bala|pethukani|

And To pass the secondname in secondname text box

And To pass mobileno or email in email text box

#with header ----------> TWO DIMENSIONAL MAP

|mail|mail1|mail2|mail3|
|46584842|848944|7984165|sfsd|
|bduyah@123|dvdvc|686dsxcc|854cc|
|maha123|maha@123|asd@123|bca@123|

#without header ----------> TWO DIMENSIONAL LIST

#|123@gmail.com|97548544545|maha@gmail.com|897154154154|
#|akjb@gmail.com|54897415418|zfv@gmail.com|168484158484|

And To create new password using new password text box

Then Close the browser
 