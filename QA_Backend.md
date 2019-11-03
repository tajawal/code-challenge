![](http://i.imgur.com/tCsIrH8.png)

## Developer Challenge
The main objective of this assignment is measuring test engineering skills. 

## Requirements and Output
### First Scenario:
1- Perform the below:
Method: GET

URI: https://www.tajawal.ae/api/hotel/ahs/v2/geo-suggest

Header params:
- parameter name: Content-Type
- parameter value: application/json

Query Params:
- parameter name: query
- parameter value: paris

Response validations: Perform needed validations on response

### Second Scenario:
2- Perform the below:
Method: POST

URI: https://www.tajawal.ae/api/hotel/ahs/search/request

Header params:
parameter name: Content-Type
parameter value: application/json

Request body:
```
{
  "dates": {
    "checkin": "11-09-2019",
    "checkout": "13-09-2019"
  },
  "destination": "paris",
  "room": [
    {
      "guest": [
        {
          "type": "ADT"
        },
        {
          "type": "ADT"
        },
        {
          "type": "CHD",
          "age": 3
        }
      ]
    },
    {
      "guest": [
        {
          "type": "ADT"
        },
        {
          "type": "ADT"
        }
      ]
    }
  ],
  "placeId": "ChIJD7fiBh9u5kcRYJSMaMOCCwQ"
}
```
Conditions: 
 - Dates should be dynamic
 - Room and guest array should be created dynamically
 
Response validations: Perform needed validations on API response

## General Conditions:
- Any framework using any programming language
- POM
- Integration with Junit

## What we are looking for
A code we can Trust!

This code is meant for testing, and passed execution does not mean working application; maybe testing code needs to be tested in the first place

## Questions And Delivery
If you have any questions to this challenge, please do reach out to us.

The challenge should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).
## Checklist
- [ ] Usage is clearly mentioned in the README file
## Note
Implementations focusing on **quality over feature completeness** will be highly appreciated,  don’t feel compelled to implement everything and even if you are not able to complete the challenge, please do submit it anyways.
