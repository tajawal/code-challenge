![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Native Apps QA - XCUITest Code Challenge
The main objective of this assignment is measuring test engineering skills.

## Application Screens

**Bill Entering Screen**

![Screen Shot 2022-06-23 at 12 20 32 PM](https://user-images.githubusercontent.com/94293020/175251886-a06a55ff-a00a-4c80-b993-71fa3e736ed3.png)

**View Bill History Screen**

<img width="405" alt="Screen Shot 2022-06-22 at 4 53 46 PM" src="https://user-images.githubusercontent.com/94293020/175251965-929d5109-ad98-4e49-ae7c-5d7d4314ee25.png">

## Requirements and Output

### Pre-requisite

1- Macbook required to implement the challenge in XCUITest

2- Checkout code from **main** branch in https://github.com/shahidlatif2021/Splito and open the project in xcode.

3- Create a test plan in iOS testing framework and configure bill tip value percentages i.e 0%,10%,15%,20%.

4- Use this percentage value from test plan and select this percentage value while entering the bill

### Main Test Scenario:

1- **Verify following scenarios when application is installed for the first time** (*You can simulate this first time install by passing --clearData in the application launching Arguments*

- Verify that in **Bill Entering Screen** user cannot enter bill more than 10000.
- Verify that in **View Bill History** Screen there is no record.
- Veirfy that in **View Bill History** Screen that total number of people is 0 by default.
- Verify that in **View Bill History** screen that total bill is 0.00 by default.

2- Create **Random** number of people and bill amount for 10 records. i.e [[4, 1000], [2, 500], .......] where 4 is **number of people** and 1000 is **bill total** in this example.

3- Add bills created in Step 2 in the application and verify that **number of people** and **bill total** is showing for all records in **View Bill History** screen.

4- Open **View Bills History** screen and add the individual count in the 10 rows for **bill total** and **number of people** to ensure that it matches the total count in the header. Please see following screenshot.

<img width="405" alt="Screen Shot 2022-06-22 at 4 53 46 PM" src="https://user-images.githubusercontent.com/94293020/175033925-b0bd7b8c-b165-4a83-97b6-a146b9ac5a00.png">


## Conditions:
- Code challenge to be done using Swift
- For automated tests, assertions are the key. We want you to explore the application and add the assertions that you think are important.
- Follow best practices for coding & automation (OOP, POM, reusable, clean, documented code).
- Test Report for the Automation (Optional)
- Minimum Xcode version is 13.2.1


## What we are looking for:
A code we can Trust!

This code is meant for testing, and passed execution does not mean working application; maybe testing code needs to be tested in the first place.

## Important points related to Delivery:
- Code challenge should be delivered as a link to a public git repository (github.com is preferred). 
- Implementations focusing on **quality over feature completeness** will be highly appreciated.  Don’t feel compelled to implement everything, while compromising on code quality.
- Follow All the Best Practices for Implementing a Quality Automation Framework.
- Even if you are not able to complete the challenge, please do submit it anyways.
- Make sure you are able to run the tests successfully
- Please avoid any ToDo's in the code.


