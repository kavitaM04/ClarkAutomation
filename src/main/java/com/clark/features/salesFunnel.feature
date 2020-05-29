Feature: Clark Sales funnel

Scenario Outline: Clark sales funnel Test Scenario

Given User opens Browser

When User is already on landing page 
Then Go to Angebote tab to enter sales funnel
Then Go to Privathaftpflicht option 
Then Accept Private liability offer
Then complete the questionnaire
Then Go to Offer
Then Select Offer
Then Enter Registration details to submit
Then Enter Personal Information: "<firstname>" , "<lastname>" , "<birthdate>" , "<street>" , "<housenumber>" , "<zipcode>" , "<city>" , "<phonenumber>" , "<IBAN>"
Then Verify that the correct contract is shown on manager route

Examples:
    |  firstname  |  lastname  |  birthdate   |  street |   housenumber  |    zipcode    |   city    |   phonenumber  |          IBAN             |
    |   test      |   kavita   |  04.09.1990  |  tonca  |     B-0/S-6    |     60306     |    Goa    |   015229320777 |  DE55500105174529223988   |
