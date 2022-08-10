![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Developer Challenge
Using the API provided by Github Search API, which is documented
here (https://docs.github.com/en/rest/search#about-the-search-api) create a SPA using React. A user should be able to search for public repositories and users.

## Requirements and Output
- Select: you should be able to select search type between 'repositories' and 'users' and do a search based on this type.
- Search: When a user enters a query and 'user' type is selected, it should be able to
get a list of users matching this query.
  - Show the user avatar, name and the link to his profile.
- Search: When a user enters a query and 'repository' type is selected, it should be able to
get a full list of public repositories matching this query.
  - Filetype: Convert the filetypes of the files in the repository into a
  tag/badge, (e.g, if the returned repository has a list of files
  containing python and javascript files, the repository should have the
  respective tags/badges).
  - Fork: Username/Avatar of the last 3 users who forked it with
  avatar linking to the fork.
  - Any other additional information, you'd like to show.
- Handle about empty/error/loading states.
- Pagination: add the infinite scroll pagination.


## Conditions
- You should think about the UI and UX of your app.
- You should think about the state management of your app.
- You should consume the api endpoint mention and not use it as internal json file.
- You should build this application in ECMAScript 6 or later.
- You should build this application using Reactjs (NextJS and Typescript will be a plus).

## What we are looking for

- **Simple, clear, readable code** How well structured it is? Clear separation of concerns? Can anyone just look at it and get the idea to
what is being done? Does it follow any standards?
- **Correctness** Does the application do what it promises? Can we find bugs or trivial flaws?
- **Memory efficiency** How will it behave in case of large datasets? Are results cached? Do you have debounce on your search?
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


