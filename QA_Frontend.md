![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Frontend QA - Code Challenge
The main objective of this assignment is measuring test engineering skills. 

## Requirements and Output
### First Scenario:

1- Navigate to​ www.tajawal.com or www.almosafer.com
 
2- Check for current set language. If language is already set to english then proceed with next steps. If not, then first change language to english and then proceed.

3- Navigate to flights-home page, and enter below criteria in flights search form to make hotel search:
- Origin - (from random array of origins - length 5)
- Destination - (from random array of destinations - length 5)
- Depart and Return Dates (randomly generated dates in future) 
- Passengers (1Adult)
- Cabin Class (Economy)

4- On flights listing page, perform below actions:
- Filter results by lowest stops option available (if non-stop and 1-stop, then filter by non-stop)
- Assert filtered results are as per selected 'stops-filter' 
- Pick random flight and related price and navigate to flight details page

5- On travelers details page provide below requirements and proceed to second page:
- Fill the contact form in bottom of page
- Donot fill the traveller form and try to proceed to payment page
- Assert that user is not able to proceed to payment page and validation errors are thrown by application for missing fields in traveller form

### Second Scenario:
1- Navigate to​ www.tajawal.com or www.almosafer.com

2- Check for current set language. If language is already set to english then proceed with next steps. If not, then first change language to english and then proceed.

3- Navigate to flights-home page, and enter below criteria in flights search form to make hotel search:
- Origin - (from random array of origins - length 5)
- Destination - (from random array of destinations - length 5)
- Depart and Return Dates (randomly generated dates in future) 
- Passengers (1Adult)
- Cabin Class (Economy)

3- Wait for loading to be completed on flight listing page

4- Use sort feature to ensure that flights are sorted by 'cheapest'
 
5- After loading is completed, fetch and save price of first flight

6- Scroll to bottom of page, fetch and save price of last flight

7- Assert the minimum-price displayed for price-range-filter equals to price of first-flight in list

8- Assert that maximum-price displayed for price-range-filter equals to price of last-light in list


## Conditions:
- Tests compatible and executable based on dynamic URL (www.tajawal.com or www.almosafer.com)
- Any framework using any programming language (preferable: cypress framework)
- Following coding & automation best practices (OOP, POM, reusable, clean, documented code)
- Report generation for executed scripts


## What we are looking for
A code we can Trust!

This code is meant for testing, and passed execution does not mean working application; maybe testing code needs to be tested in the first place.

## Important points related to Delivery
- Code challenge should be delivered as a link o a public git repository (github.com or bitbucket.com are preferred).
- Implementations focusing on **quality over feature completeness** will be highly appreciated.  Don’t feel compelled to implement everything, while compromising on code quality. 
- Even if you are not able to complete the challenge, please do submit it anyways.


