Feature: Contact page

Scenario: Check that form validation works on the contact page 

Given launch the site
Then lands on home page
When click on GET IN TOUCH button
Then lands on Contact page
And click on click on submit
Then verify that Please complete all required fields text should display
And close the browser
