![](http://i.imgur.com/tCsIrH8.png)

## Developer Challenge
The main objective of this assignment is measuring test engineering skills. 

Two simple and forward scenarios are required to pass this assignment.

## Requirements and Output
### First Scenario:
1- Navigate to​ www.tajawal.ae

2- Pass the below search params in to search module and search:
- Random array of origins (length 5)
- Random array of destinations (length 5)
- Random dates
- 2Adults
- Economy class

3- On listing page provide below requirements and proceed to second page:
- Assert that your search query data you provide is aligned with search summary module
- Filter results to Emirates carrier (if found), if not found filter to any specific carrier
- Assert listing results are only the selected carrier
- Pick random flight and related price and navigate to details page

4- On travelers details page provide below requirements and proceed to second page:
- Fetch the cart price and make sure it is aligned with listing price
- Fill travelers details with proper entries

### Second Scenario:
1- Navigate to​ www.tajawal.com

2- Search for any valid search query (no specific data)

3- On listing page sort results by lower price (Ascending)

4- Fetch first flight price

5- Assert that first price INTs are the lowest comparing to other prices

6- Fetch all listing prices and save it in a .CSV file


## Conditions:
- Any framework using any programming language
- Executable based on dynamic URL (www.tajawal.ae, www.tajawal.com )
- BDD
- POM
- Can be executed on chrome, firefox at least
- Screenshots for (last page is enough)
- HTML report for the test run result


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
