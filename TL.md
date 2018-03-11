![](http://i.imgur.com/XFAzEuc.png)

## Developer Challenge

The objective of this challenge is to build a simple web application (Backend & Frontend) which enable the end user to manage and search in hotels list.


## Requirements and Output

### Backend
Create a simple Restufl API to **manage** hotels data (CRUD operations) and **Search** in it.

Example of basic hotel data can be found in this endpoint [https://api.myjson.com/bins/tl0bp](https://api.myjson.com/bins/tl0bp),
Feel free to change any field name or field type in the schema, the provided example is just to guide you.

API consumer should be able to search by any of the following:

- Hotel Name
- Destination [City]
- Price range [ex: $100:$200]
- Date range [ex: 10-10-2020:15-10-2020]

and allow sorting by:

- Hotel Name
- Price

Use **Mongodb** to design and store the hotels data, Feel free to store data in one or multiple collections

#### Backend Expected Delivery:
We are expecting your restful API to have endpoints to do all crud and search operations for hotels, This is including : Error Handling, Response data pagination, Input validation

### Frontend
Build a frontend application to consume your API using one of the following:
- Angular
- React
- Vuejs

#### Frontend Expected Delivery:
We are expecting to be able to do all crud operations through your frontend app, This is including search and sorting hotels.
## Conditions

- Build DB seeder to import your database
- You can use PHP >= 7.0 or NodeJs =>9.x or both to accomplish this task
- Write Unit tests for both Frontend & Backend application
- Implement [travis](https://travis-ci.org) or [scrutinizer-ci](https://scrutinizer-ci.com) or any other CI tool for the project, Add the build status badges to your project README file
- Use [codeclimate](https://codeclimate.com) or any other alternative to estimate the code quality and add it's badge to your project README file
- Do not use any full-text search engines like elasticsearch or solar
- If you make any assumptions while solving the exercise please mention them clearly in the readme file

## What we are looking for

- **Simple, clear, readable code** How well structured it is? Clear separation of concerns? Can anyone just look at it and get the idea to
what is being done? Does it follow any standards?
- **Correctness** Does the application do what it promises? Can we find bugs or trivial flaws?
- **Security** are there any obvious vulnerability?
- **Memory efficiency** How will it behave in case of large datasets?
- **Testing** How well tested your application is? Can you give some metrics?
- **Documentation** Is the code self documented and it's easy to understand it by just reading?

## Questions & Delivery

If you have any questions about this challenge, please do reach out to us.

The challenge solution should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).

## Checklist

Before submitting, make sure that your program

- [ ] Code accompanies the Unit Tests
- [ ] Usage is clearly mentioned in the README file, This including setup the project, how to run it, how to run unit test, examples,etc
## Notes

- Implementations focusing on **quality over feature completeness** will be highly appreciated,
don’t feel compelled to implement everything and even if you are not able to complete the challenge,
please do submit it anyways.
