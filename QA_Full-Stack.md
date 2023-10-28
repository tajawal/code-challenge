![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)


# Full-Stack QA - Code Challenge
The main objective of this assignment is to measure the candidate’s test engineering skills.
## General Information
Please read the information below carefully before proceeding to the next section.
- Code challenge should be submitted as a link to a public git repository (github.com is preferred).
- We are looking for code that we can Trust! Follow best practices for coding & automation (OOP, POM, reusable, clean, documented code, etc).
- Implementations focusing on quality over feature completeness will be highly appreciated. Do not feel compelled to implement everything and even if you are not able to complete the challenge in the given time, please submit the work done.
- Remember, A test passing an execution does not mean that the application works as expected. Ensure you look out for false negative and false positive tests.
- If you have any questions about this challenge, please do not hesitate to reach out to us.
Good Luck!

## First Scenario:
Step one: Perform a flight search from RUH - JED for 2 adults for any upcoming dates.
- Method: GET
- URI: https://ae.almosafer.com/api/v3/flights/flight/search?query=RUH-JED/2023-11-20/2023-11-30/Economy/2Adult
- Header params:
    - parameter name: Content-Type 
    - parameter value: application/json
- Parse the JSON response and perform necessary assertions.

Step two: Retrieve the flight search results using json response from step one above. 
- Method: POST
- URI: https://ae.almosafer.com/api/v3/flights/flight/async-search-result
- Header params:
    - parameter name: Content-Type 
    - parameter value: application/json
- Request body: Full json response from step one above


### Conditions
- Dates should be dynamic
- Perform needed assertions on the API response
- Report generation for executed scripts


## Second Scenario:
1. Navigate to​ configurable base URL (can be tajawal.com or almosafer.com)
2. Check for current set language. If language is already set to English then proceed with the next steps. If not, then first change language to English and then proceed.
3. Navigate to flights-home page, and enter the below criteria in flights search form to make flight search:
    - Origin - (from a random array of origins - length 5) (Example: DXB, AUH, SHJ, JED, RUH)
    - Destination - (from a random array of destinations - length 5) (Example: AMM, CAI, DEL, KHI, PAR)
    - Departure and Return Dates (randomly generated dates in the future)
    - Passengers (1Adult)
    - Cabin Class (Economy)
4. Wait for loading to be completed on the flight listing page
5. Use the sort feature to ensure that flights are sorted by 'cheapest'
6. After loading is complete, fetch and save the price of the first flight
7. Assert the minimum price displayed for price-range-filter equals to the price of first-flight in the list


### Conditions:
- Same tests to be compatible with both tajawal.com & almosafer.com. Executed based on base URL passed in execution command
- Code challenge should be done using Cypress preferably. If you wish to use any other tool, please communicate this in advance
- Perform the needed assertions on the application response
- Report generation for executed scripts
