![](http://i.imgur.com/tCsIrH8.png)

## Developer Challenge

The objective of this challenge is to hit an endpoint containing the list of hotels and perform some actions on the result.
The challenge must be solved in PHP or NodeJs.

The URL containing the list of hotels can be found at [https://api.myjson.com/bins/tl0bp](https://api.myjson.com/bins/tl0bp)

## Requirements and Output

#### Create a RESTful API to **allow search** in the given inventory by any of the following:

- Hotel Name
- Destination [City]
- Price range [ex: $100:$200]
- Date range [ex: 10-10-2020:15-10-2020]

and allow sorting by:

- Hotel Name
- Price

This is including search by multiple criteria in the same time like search by destination and price together.

## Conditions

- You can use any framework or tool, You also can build it all also from scratch if you like
- Fetch the data directly from the URL and not create a JSON file
- Use PHP >= 7.1  for the development or NodeJs >= 9.x
- Write full test using any test suite like PHPUnit for php or Jest for JS, Whatever you prefer
- Implement [travis](https://travis-ci.org) or [scrutinizer-ci](https://scrutinizer-ci.com) or any other CI tool for the project, Add the build status badges to your project README file
- Use [codeclimate](https://codeclimate.com) or any other alternative to estimate the code quality and add it's badge to your project README file
- Do not use any database or any full text search engines
- If you make any assumptions, mention them clearly in the readme file

## What we are looking for

- **Simple, clear, readable code** How well structured it is? Clear separation of concerns? Can anyone just look at it and get the idea to
what is being done? Does it follow any standards?
- **Correctness** Does the application do what it promises? Can we find bugs or trivial flaws?
- **Security** are there any obvious vulnerability?
- **Memory efficiency** How will it behave in case of large datasets?
- **Testing** How well tested your application is? Can you give some metrics?
- **Documentation** Is the code self documented and it's easy to understand it by just reading?


## Commit History
- Use whatever development workflow works best for you. If your solution is small enough and a single commit is justified, that's fine; we just ask that you keep your commit history as coherent as possible.

## Questions & Delivery

If you have any questions about this challenge, please do reach out to us.

The challenge solution should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).

## Checklist

Before submitting, make sure that your program

- [ ] Code accompanies the Unit Tests
- [ ] Usage is clearly mentioned in the README file, This including setup the project, how to run it, how to run unit test, examples,etc
- [ ] Uses the endpoint directly

## Note

Implementations focusing on **quality over feature completeness** will be highly appreciated, don’t feel compelled to implement everything and even if you are not able to complete the challenge, please do submit it anyways.

