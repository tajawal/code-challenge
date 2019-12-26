![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Native Apps QA - Code Challenge
The main objective of this assignment is measuring test engineering skills. 

## Requirements and Output

### Main Test Scenario:

1- Open Tajawal or Almosafer Native Mobile App

2- Check for current set language. If language is already set to english then proceed with next steps. If not, then first change language to english and then proceed.

3- Navigate to flights-home page, and enter below criteria in flights search form to make flight search:
- Origin - (from random array of origins - length 5) (Example: DXB, AUH, SHJ, JED, RUH)
- Destination - (from random array of destinations - length 5) (Example: AMM, CAI, DEL, KHI, PAR)
- Depart and Return Dates (randomly generated dates in future. Do not select date in current month) 
- Passengers (1Adult)
- Cabin Class (Economy)

3- Wait for loading to be completed on flight listing page

4- Assert the Dates in the flight listing page on the header

5- Use sort feature to ensure that flights are sorted by 'cheapest'
 
6- After loading is completed, fetch and save price of first flight

7- Assert the minimum-price displayed for price-range-filter equals to price of first-flight in list


## Conditions:
- iOS OR Android Native App
- Code challenge to be done using Appium / Java / testNG
- For automated tests, assertions are the key. We want you to explore the application and add the assertions that you think are important.
- Follow best practices for coding & automation (OOP, POM, reusable, clean, documented code).


## What we are looking for:
A code we can Trust!

This code is meant for testing, and passed execution does not mean working application; maybe testing code needs to be tested in the first place.

## Important points related to Delivery:
- Code challenge should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred). 
- Implementations focusing on **quality over feature completeness** will be highly appreciated.  Don’t feel compelled to implement everything, while compromising on code quality. 
- Even if you are not able to complete the challenge, please do submit it anyways.
- Please avoid any ToDo's in the code.


