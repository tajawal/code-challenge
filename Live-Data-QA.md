<img width="130" alt="Screenshot 2024-09-10 at 11 42 36 AM" src="https://github.com/user-attachments/assets/076ded8b-63a2-45cc-821c-ca109fc7e6a2">

# Data QA - Code Challenge

The main objective of this assignment is measuring test engineering skills.

---

## Requirements and Output

### Challenge One:  
**e-Commerce Highest Customer Revenue**

e-commerce marketing analytics, they need to find the customer who generated the most revenue for them during **July 2021**.  

Revenue rules:  

- **type=BUY** → transaction amount is potential revenue.  
- **type=SELL** → Mart collects a 10% fee (0.1 * amount).  
- **status=COMPLETED** → transaction is included.  
- **status=PENDING** → transaction is ignored.  
- **status=CANCELED** → 1% of the transaction amount is *deducted* from revenue.  

**Columns to report**:  
- `customer`  
- `buy` → number of BUY transactions  
- `sell` → number of SELL transactions  
- `completed` → number of COMPLETED transactions  
- `pending` → number of PENDING transactions  
- `canceled` → number of CANCELED transactions  
- `total` → calculated revenue, rounded to 2 decimals (show trailing zeros)  

---

#### Schema

**transactions**

| name     | type         | description                |
|----------|--------------|----------------------------|
| dt       | VARCHAR(19)  | Transaction timestamp      |
| customer | VARCHAR(64)  | Customer email address     |
| type     | VARCHAR(4)   | Transaction type (BUY/SELL)|
| amount   | DECIMAL(5,2) | Transaction amount         |
| status   | VARCHAR(9)   | Transaction status         |

---

#### Sample Data

**transactions**

| dt                  | customer                  | type | amount | status     |
|---------------------|---------------------------|------|--------|------------|
| 2021-07-18 03:13:37 | stapenden1@google.de      | BUY  | 95.90  | COMPLETED  |
| 2021-07-09 09:56:13 | jpeddersen6@virginia.edu  | BUY  | 34.37  | CANCELED   |
| 2021-07-13 01:12:15 | rclaypole0@qq.com         | BUY  | 79.27  | COMPLETED  |
| 2021-07-05 02:12:53 | asmithin4@elegantthemes.com | SELL | 23.80  | PENDING  |
| 2021-06-21 13:50:29 | bhaddeston2@mapquest.com  | BUY  | 89.55  | COMPLETED  |
| 2021-06-28 08:09:02 | cpalek8@yahoo.com         | SELL | 64.45  | CANCELED   |
| 2021-07-23 07:07:29 | rclaypole0@qq.com         | BUY  | 19.92  | COMPLETED  |
| 2021-07-03 15:20:54 | rclaypole0@qq.com         | SELL | 51.30  | COMPLETED  |
| 2021-07-13 18:05:55 | stapenden1@google.de      | SELL | 86.29  | COMPLETED  |
|2021-07-16 08:25:11	| rclaypole0@qq.com       	| BUY  |	53.19	| PENDING    |
|2021-07-22 02:24:59	|rclaypole0@qq.com	        | BUY	 | 51.17  |	CANCELED   |
|2021-06-23 21:42:24	|bhaddeston2@mapquest.com	  | SELL | 10.57	| PENDING    |
|2021-07-22 09:11:56	|rclaypole0@qq.com	        | BUY	 |68.25	  | COMPLETED  |
|2021-07-19 04:11:50	|rclaypole0@qq.com	        | SELL |66.78	  |  PENDING   |
|2021-07-03 19:00:10	|gnickerson3@globo.com	    |BUY	 |26.31	  | PENDING    |
|2021-07-11 17:56:06	|bhaddeston2@mapquest.com	  |BUY	 |86.05	  | CANCELED   |
|2021-07-03 01:58:09	|stapenden1@google.de	      |SELL	 |31.49	  | CANCELED   |
|2021-06-30 22:03:17	|bhaddeston2@mapquest.com	  |BUY	 | 50.93	| PENDING    |
|2021-07-09 14:22:39	|stapenden1@google.de       |	BUY	|  5.40	  |CANCELED    |


The expected output is:

|customer          |  buy |	sell |	total ▼ |
|------------------|------|------|----------|
|rclaypole0@qq.com |	67.02 |	-0.03	| 66.99|
|bhaddeston2@mapquest.com	|-1.02 |	9.02 |	8.00|
|gnickerson3@globo.com |	0.00	| 0.00	| 0.00 |
|asmithin4@elegantthemes.com	| 0.00 |	-0.40	| -0.40|
|stapenden1@google.de |	-0.99	| -0.31 |	-1.30 |

Detail for rclaypole0@qq.com
transactions
| dt                  |type  | amount | status     |
|---------------------|------|--------|------------|
|2021-07-09 20:03:14	| BUY	 | 71.46	| CANCELED   |
|2021-07-22 02:24:59	| BUY	 | 51.17	| CANCELED   |
|2021-07-22 09:11:56	| BUY  | 68.25	| COMPLETED  |
|2021-07-16 08:25:11	| BUY	 | 53.19	| PENDING    |
|2021-07-16 04:36:58	| SELL |	3.37	| CANCELED   |
|2021-07-06 04:56:06	| SELL |	69.35	| PENDING    |
|2021-07-19 04:11:50	| SELL |	66.78	| PENDING    |


---

### Challenge Two:  
**Antivirus Detection Rates**

An organization uses multiple antivirus software across its computer systems. A query needs to be developed to analyze the detection rate of each software based on scan reports.  

**Requirements**:  
- Return all antivirus software whose most recent scan reported **>10 detections**.  
- Columns:  
  - `title` → product title  
  - `last_detections` → detections in the most recent scan  
  - `change_in_detections` → difference vs. previous scan  
- Order by `last_detections` (DESC), then `title` (ASC).  

---
#### Clarification

- **Most recent scan** = the row with the **maximum `dt`** per software.  
- **Previous scan** = the row with the **next maximum `dt`** (immediately before the most recent one).  
- If a software has **only one scan record**, exclude it from the results.

#### Schema

**softwares**

| name | type        | constraint  | description                       |
|------|-------------|-------------|-----------------------------------|
| id   | INT         | PRIMARY KEY | Antivirus software ID             |
| title| VARCHAR(255)| UNIQUE      | Product title of the antivirus    |

**scans**

| name        | type       | constraint                  | description              |
|-------------|------------|-----------------------------|--------------------------|
| software_id | INT        | FOREIGN KEY → softwares.id  | Antivirus software ID    |
| dt          | VARCHAR(19)|                             | Scan datetime            |
| detections  | INT        |                             | Number of detections     |

### softwares

| id | title        |
|----|--------------|
| 1  | SecureShield |
| 2  | DefenderPro  |
| 3  | SafeGuard    |

### scans

| software_id | dt                  | detections |
|-------------|---------------------|------------|
| 1           | 2023-06-26 03:51:52 | 4          |
| 1           | 2023-07-03 22:28:37 | 8          |
| 1           | 2023-07-10 05:51:31 | 2          |
| 1           | 2023-07-11 20:49:45 | 12         |
| 1           | 2023-07-24 00:21:44 | 13         |
| 1           | 2023-07-24 07:35:17 | 9          |
| 1           | 2023-07-25 10:56:12 | 2          |
| 1           | 2023-07-26 15:12:36 | 12         |
| 2           | 2023-07-02 20:06:09 | 17         |
| 2           | 2023-07-21 10:03:18 | 13         |
| 2           | 2023-07-24 10:15:22 | 6          |
| 2           | 2023-07-27 15:10:20 | 18         |
| 2           | 2023-08-04 08:54:55 | 3          |
| 2           | 2023-08-06 15:21:06 | 4          |
| 2           | 2023-08-07 16:41:19 | 8          |
| 3           | 2023-07-06 07:06:48 | 3          |
| 3           | 2023-07-13 00:28:19 | 2          |
| 3           | 2023-07-15 04:19:28 | 20         |
| 3           | 2023-07-19 21:06:56 | 8          |
| 3           | 2023-07-21 07:22:24 | 9          |

The expected output is:
|title |	last_detections	| change_in_detections |
|------|------------------|----------------------|
|SecureShield	| 12	| 10 |
---


### Challenge Three:  
**Insurance Risk Analysis**

An insurance company analyzes the risk of applicants before issuing policies.  

Monthly premiums:  
- Term Life / Whole Life → **$100**  
- Health → **$400**  
- Endowment → **$500**  

Payout rules (as % of yearly collected premium):  

| Insurance Type | Low Risk | Medium Risk | High Risk |
|----------------|----------|-------------|-----------|
| Term Life      | 10%      | 8.5%        | 7%        |
| Whole Life     | 10%      | 8.5%        | 7%        |
| Health         | 2%       | 1.5%        | 1%        |
| Endowment      | 15%      | 12%         | 10%       |


You are given a table **`users`** with the following schema:

| Column         | Type     | Description                                                   |
|----------------|----------|---------------------------------------------------------------|
| user_id        | INTEGER  | Unique identifier of the user                                 |
| insurance_type | VARCHAR  | Type of insurance (e.g., Term Life, Health, Whole Life, Endowment) |
| risk           | VARCHAR  | Risk level (Low, Medium, High)                                |

## Sample Data

| user_id | insurance_type | risk   |
|---------|----------------|--------|
| 6697    | Term Life      | Medium |
| 4084    | Term Life      | Medium |
| 3053    | Health         | Medium |
| 2716    | Term Life      | Medium |
| 3130    | Health         | Medium |
| 4146    | Whole Life     | Low    |
| 5875    | Health         | Low    |
| 8747    | Whole Life     | High   |
| 2095    | Term Life      | Medium |
| 8374    | Term Life      | High   |
| 6014    | Whole Life     | High   |
| 6546    | Endowment      | High   |
| 4533    | Term Life      | Low    |
| 7174    | Health         | Low    |
| 4470    | Health         | Medium |
| 1364    | Whole Life     | Low    |
| 4293    | Health         | High   |
| 7062    | Health         | Medium |
| 6839    | Term Life      | Medium |
| 9596    | Health         | Low    |

The expected output is:

| user_id	| insurance_type	| risk	| insured_amount |
|---------|-----------------|-------|----------------|
|1364 |	Whole Life |	Low |	5760 |
|2095	| Term Life |	Medium |	4896 |
|2716	| Term Life |	Medium |	4896 |
|3053	| Health |	Medium |	864 |
|3130	| Health |	Medium |	864 |
|4084	| Term Life |	Medium |	4896 |
|4146	| Whole Life |	Low	5760 |
|4293	| Health |	High |	576 |
|4470	| Health |	Medium |	864 |
|4533	| Term Life |	Low |	5760 |
|5875	| Health |	Low |	1152 |
|6014	| Whole Life |	High |	4032 |
|6546	| Endowment |	High |	5760 |
|6697	| Term Life |	Medium |	4896 |
|6839	| Term Life |	Medium |	4896 |
|7062	| Health |	Medium |	864 |
|7174	| Health |	Low |	1152 |
|8374	| Term Life |	High |	4032 |
|8747	| Whole Life |	High |	4032 |
|9596	| Health |	Low |	1152 |

---


### Challenge Four:  
**Confirmation Rate**
Table: Signups

| Column Name    | Type     |
|----------------|----------|
| user_id        | int      |
| time_stamp     | datetime |


user_id is the column of unique values for this table.
Each row contains information about the signup time for the user with ID user_id.

Table: Confirmations


| Column Name    | Type     |
|----------------|----------|
| user_id        | int      |
| time_stamp     | datetime |
| action         | ENUM     |

(user_id, time_stamp) is the primary key (combination of columns with unique values) for this table.
user_id is a foreign key (reference column) to the Signups table.
action is an ENUM (category) of the type ('confirmed', 'timeout')
Each row of this table indicates that the user with ID user_id requested a confirmation message at time_stamp and that confirmation message was either confirmed ('confirmed') or expired without confirming ('timeout').

The confirmation rate of a user is the number of 'confirmed' messages divided by the total number of requested confirmation messages. The confirmation rate of a user who did not request any confirmation messages is 0. Round the confirmation rate to two decimal places.

**Task**:  
- Calculate insured amount per user.  
- Round to nearest integer.  
- Return columns: `user_id`, `insurance_type`, `risk`, `insured_amount`.  
- Order by `user_id`.

Write a solution to find the confirmation rate of each user.

Return the result table in any order.

The result format is in the following example.

Input: 
Signups table:

| user_id | time_stamp          |
|---------|---------------------|
| 3       | 2020-03-21 10:16:13 |
| 7       | 2020-01-04 13:57:59 |
| 2       | 2020-07-29 23:09:44 |
| 6       | 2020-12-09 10:39:37 |

Confirmations table:

| user_id | time_stamp          | action    |
|---------|---------------------|-----------|
| 3       | 2021-01-06 03:30:46 | timeout   |
| 3       | 2021-07-14 14:00:00 | timeout   |
| 3       | 2021-07-19 14:00:00 | confirmed |
| 7       | 2021-06-12 11:57:29 | confirmed |
| 7       | 2021-06-13 12:58:28 | confirmed |
| 7       | 2021-06-14 13:59:27 | confirmed |
| 7       | 2021-07-14 13:59:27 | timeout   |
| 2       | 2021-01-22 00:00:00 | confirmed |
| 2       | 2021-02-28 23:59:59 | timeout   |

Output: 

| user_id | confirmation_rate |
|---------|-------------------|
| 6       | 0.00              |
| 3       | 0.35              |
| 7       | .80               |
| 2       | 0.50              |


---

### Challenge Five:  
**Average Selling Price**
Table: Prices

| Column Name   | Type    |
|---------------|---------|
| product_id    | int     |
| start_date    | date    |
| end_date      | date    |
| price         | int     |

(product_id, start_date, end_date) is the primary key (combination of columns with unique values) for this table.
Each row of this table indicates the price of the product_id in the period from start_date to end_date.
For each product_id there will be no two overlapping periods. That means there will be no two intersecting periods for the same product_id.

Table: UnitsSold


| Column Name   | Type    |
|---------------|---------|
| product_id    | int     |
| purchase_date | date    |
| units         | int     |

This table may contain duplicate rows.
Each row of this table indicates the date, units, and product_id of each product sold. 

Write a solution to find the average selling price for each product. average_price should be rounded to 2 decimal places. If a product does not have any sold units, its average selling price is assumed to be 0.
Return the result table in any order.

The result format is in the following example.

Example 1:

Input: 
Prices table:

| product_id | start_date | end_date   | price  |
|------------|------------|------------|--------|
| 1          | 2019-02-17 | 2019-02-28 | 5      |
| 1          | 2019-03-01 | 2019-03-22 | 20     |
| 2          | 2019-02-01 | 2019-02-20 | 15     |
| 2          | 2019-02-21 | 2019-03-31 | 30     |

UnitsSold table:

| product_id | purchase_date | units |
|------------|---------------|-------|
| 1          | 2019-02-25    | 100   |
| 1          | 2019-03-01    | 15    |
| 2          | 2019-02-10    | 200   |
| 2          | 2019-03-22    | 30    |

Output: 

| product_id | average_price |
|------------|---------------|
| 1          | 6.96          |
| 2          | 16.96         |

Explanation: 
Average selling price = Total Price of Product / Number of products sold.


---

### Challenge Six: 
**Monthly Transactions**

able: Transactions


| Column Name   | Type    |
|---------------|---------|
| id            | int     |
| country       | varchar |
| state         | enum    |
| amount        | int     |
| trans_date    | date    |

id is the primary key of this table.
The table has information about incoming transactions.
The state column is an enum of type ["approved", "declined"].

Write an SQL query to find for each month and country, the number of transactions and their total amount, the number of approved transactions and their total amount.

Return the result table in any order.

The query result format is in the following example.

Input: 
Transactions table:

| id   | country | state    | amount | trans_date |
|------|---------|----------|--------|------------|
| 121  | US      | approved | 1000   | 2018-12-18 |
| 122  | US      | declined | 2000   | 2018-12-19 |
| 123  | US      | approved | 2000   | 2019-01-01 |
| 124  | DE      | approved | 2000   | 2019-01-07 |

Output: 

| month    | country | trans_count | approved_count | trans_total_amount | approved_total_amount |
|----------|---------|-------------|----------------|--------------------|-----------------------|
| 2018-12  | US      | 2           | 1              | 3000               | 1000                  |
| 2019-01  | US      | 1           | 1              | 2000               | 2000                  |
| 2019-01  | DE      | 1           | 1              | 2000               | 2000                  |


---

### Challenge Seven: 
**Repeated Payments**
Stripe asked this , about identifying any payments made at the same merchant with the same credit card for the same amount within 10 minutes of each other and reporting the count of such repeated payments.

transactions Example Input:

| transaction_id	| merchant_id	| credit_card_id	| amount	| transaction_timestamp| 
|----------------	|-------------|-----------------|---------|----------------------|
| 1	| 101	| 1	| 100	| 09/25/2022 12:00:00 |
| 2 | 101	| 1	| 100	| 09/25/2022 12:08:00 |
| 3	| 101	| 1	| 100	| 09/25/2022 12:28:00 |
| 4	| 102	| 2	| 300	| 09/25/2022 12:00:00 |
| 6	| 102	| 2	| 400	| 09/25/2022 14:00:00 |

Example Output:

| payment_count |
|---------------| 
| 1 |

------


A query we can **trust**! ✅  

Passing execution does not automatically mean correctness — queries must return the exact expected output.

Your SQL code should be:  
- **Accurate** → produces the right results.  
- **Reliable** → works on different valid datasets.  
- **Clear** → easy to read and understand.  

---

## Important Notes for Delivery:

- Deliver the challenge as a **public Git repository** (GitHub/Bitbucket preferred).  
- **Quality > completeness**. Don’t implement everything at the cost of messy code.  
- Even if you can’t finish, submit your work.  
