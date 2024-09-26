@Feature3
Feature: To validate the accout creation of the Amazon Application

Scenario: To  validate sigin with invalid mobile number

Given To launch the browser and maximize window

When To launch the url of the Amazon application 

And To click sigin button
    
And  To pass the valid and invalid mobile number or email in mobile number field

#without header -------> ONE DIMENSIONAL LIST

|48546214898|laksh@gmail.com|9361847494|vgv@gmail.com|bca@gmail.com|

#with header ------> ONE DIMENSIONAL MAP

#|phonenumber1|98798654818|
#|phonenumber2|9361847494|
#|phonenumber3|123@gmail.com|
#|phonenumber4|gdf@gamil.com|
    
And To click the continue button

Then  To close the all browser

  
