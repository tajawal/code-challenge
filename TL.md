![](http://i.imgur.com/XFAzEuc.png)

## Developer Challenge

The objective of this challenge is to parse a log file and do some analysis on it. It should be an easy task for anyone with basic programming skills. The challenge must be solved in PHP.

Unit tests are highly appreciated but not a must.

Sample log can be downloaded here: [https://goo.gl/MKmKNG](https://goo.gl/MKmKNG)

## Requirements & output

The log file contains all requests to a server within a specific timeframe. Given the following endpoints

```
GET /api/users/{user_id}/count_bookings
GET /api/users/{user_id}/get_bookings
GET /api/users/{user_id}/get_booking_progress
GET /api/users/{user_id}/get_upcoming_bookings
POST /api/users/{user_id}
GET /api/users/{user_id}
```

Where `{user_id}` is the id of the user calling the backend.

Write a command line program that outputs a small analysis of the sample log containing at least the following for each of the endpoints above:

- The number of times any endpoint was accessed
- The average of the response time (connect time + service time) for each endpoint
- The IP which hit the server the most
- The "dyno" that responded the most

## Output

The output should just be simple text lines and can roughly look like below for each of the above given endpoints:

```
GET /api/users/{user_id}/count_bookings

Access Count: 200
Average Response Time: 10ms
Most Active IP: 94.66.255.106 
Most Active Dyno: web.3
```

## What we are looking for

- **Simple, clear, readable code** How well structured it is? Clear separation of concerns? Can anyone just look at it and get the idea to
what is being done? Does it follow any standards?
- **Correctness** Does the application do what it promises? Can we find bugs or trivial flaws?
- **Memory efficiency (optional)** How will it behave in case of large datasets?
- **Testing (optional)** How well tested your application is? Can you give some metrics?

## Questions & Delivery

If you have any questions to this challenge, please do reach out to us.

The challenge should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).

## Checklist

Before submitting, make sure that your program

- [ ] Can be run from the command line
- [ ] Is non-interactive, does not require user input
- [ ] Generates plain text output
- [ ] Returns one entry for each of the 6 endpoints listed above

## Note

Implementations focusing on **quality over feature completeness** will be highly appreciated,  don’t feel compelled to implement everything and even if you are not able to complete the challenge, please do submit it anyways.
