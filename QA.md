## Task:
Kindly refer to below requested scenarios

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


### Config:
Above test should be:
- Executable based on dynamic URL (www.tajawal.ae, www.tajawal.com )
- Can be executed on chrome, firefox
- Screenshots for (last page is enough)
- Html report for the test run

### Framework:
- Any framework using any programming language (PHP is a plus)
- Make sure to deliver BDD style
- POM (page object module)