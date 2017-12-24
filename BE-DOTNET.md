![](http://i.imgur.com/XFAzEuc.png)

## Developer Challenge

The objective of this challenge is to hit an endpoint containing the list of hotels and perform some actions on the result. It should be an easy task for anyone with basic programming skills. The challenge must be solved in C#.

The URL containing the list of hotels can be found at [https://api.myjson.com/bins/tl0bp](https://api.myjson.com/bins/tl0bp)

## Requirements and Output

#### Create an application (Aspnet Web API or WCF) to **allow search** in the given inventory by any of the following:

- Hotel Name
- Destination [City]
- Price range [ex: $100:$200]
- Date range [ex: 10-10-2020:15-10-2020]

and allow sorting by:

- Hotel Name
- Price


## Conditions

- Fetch the data directly from the URL and not create a JSON file
- Use .Net Framework >= 4.5.2  for the development
- Write Unit tests in MSTest or xUnit, whatever you prefer
- Implement [AppVeyor](https://www.appveyor.com) or [travis](https://travis-ci.org) or any other CI tool for the project, Add the build status badges to your project README file
- Use [coveralls](https://coveralls.io) or any other alternative to estimate the code coverage and add it's badge to your project README file
- Do not use any database or full text search engines
- If you make any assumptions, put them clearly in the readme file

## What we are looking for

- **Simple, clear, readable code** How well structured it is? Clear separation of concerns? Can anyone just look at it and get the idea to
what is being done? Does it follow any standards?
- **Correctness** Does the application do what it promises? Can we find bugs or trivial flaws?
- **Memory efficiency** How will it behave in case of large datasets?
- **Testing** How well tested your application is? Can you give some metrics?

## Questions & Delivery

If you have any questions to this challenge, please do reach out to us.

The challenge should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).

## Checklist

Before submitting, make sure that your program

- [ ] Code accompanies the Unit Tests
- [ ] Usage is clearly mentioned in the README file, This including setup the project, how to run it, how to run unit test, examples,etc
- [ ] Uses the endpoint directly

## Note

Implementations focusing on **quality over feature completeness** will be highly appreciated,  don’t feel compelled to implement everything and even if you are not able to complete the challenge, please do submit it anyways.

