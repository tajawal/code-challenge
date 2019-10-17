![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Frontend QA - Code Challenge
The main objective of this assignment is measuring test engineering skills. 

## Requirements and Output
### First Scenario:

1- Navigate to​  configurable base URL (can be tajawal.com or almosafer.com) 
 
2- Check for current set language. If language is already set to english then proceed with next steps. If not, then first change language to english and then proceed.

3- Navigate to flights-home page, and enter below criteria in flights search form to make flight search:
- Origin - (from random array of origins - length 5) (Example: DXB, AUH, SHJ, JED, RUH)
- Destination - (from random array of destinations - length 5) (Example: AMM, CAI, DEL, KHI, PAR)
- Depart and Return Dates (randomly generated dates in future) 
- Passengers (1Adult)
- Cabin Class (Economy)

4- On flights listing page, perform below actions:
- Filter results by lowest stops option available (lets say if it is only 1-stop and 2-stop, then filter by 1-stop)
- Assert filtered results are as per selected 'stop-filter' 
- Select random flight and to move to flight traveller page

5- On travellers page, perform below:
- Fill the contact form in bottom of page with valid data
- Do not fill the traveller form 
- Click 'continue' button to try to go to payment page
- Assert that user is not able to proceed to payment page and validation errors are thrown by application for missing fields in traveller form

### Second Scenario:

1- Navigate to​  configurable base URL (can be tajawal.com or almosafer.com) 

2- Check for current set language. If language is already set to english then proceed with next steps. If not, then first change language to english and then proceed.

3- Navigate to flights-home page, and enter below criteria in flights search form to make flight search:
- Origin - (from random array of origins - length 5) (Example: DXB, AUH, SHJ, JED, RUH)
- Destination - (from random array of destinations - length 5) (Example: AMM, CAI, DEL, KHI, PAR)
- Depart and Return Dates (randomly generated dates in future) 
- Passengers (1Adult)
- Cabin Class (Economy)

3- Wait for loading to be completed on flight listing page

4- Use sort feature to ensure that flights are sorted by 'cheapest'
 
5- After loading is completed, fetch and save price of first flight

6- Assert the minimum-price displayed for price-range-filter equals to price of first-flight in list


## Conditions:
- Same tests to be compatible with both tajawal.com & almosafer.com. Executed based on base URL passed in execution command. 
- Code challenge to be done using Cypress / Javascript preferably. In case of any concerns or want to use different tool, please communicate to us.
- For automated tests, assertions are the key. We want you to explore the application and add the assertions that you think are important.
- Follow best practices for coding & automation (OOP, POM, reusable, clean, documented code).
- Report generation for executed scripts.


## What we are looking for:
A code we can Trust!

This code is meant for testing, and passed execution does not mean working application; maybe testing code needs to be tested in the first place.

## Important points related to Delivery:
- Code challenge should be delivered as a link o a public git repository (github.com or bitbucket.com are preferred). 
- Implementations focusing on **quality over feature completeness** will be highly appreciated.  Don’t feel compelled to implement everything, while compromising on code quality. 
- Even if you are not able to complete the challenge, please do submit it anyways.


