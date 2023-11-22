![](https://argaamplus.s3.amazonaws.com/159afd60-8669-4140-aa9e-fe46791f515d.png)

## Data QA - Code Challenge

The main objective of this assignment is measuring test engineering skills.

## Requirements and Output

### Challenge One:

You have given customer-related data in SQL table,
1- validate the data using SQL queries, and show your output in excel sheet.
2- Can this table be signed off and shared with stackholders or not? explain your answer

| ID  | First Name | Last Name | Address       | City       | State | Zip Code | Phone Number | Email                   | Birthdate  |
| --- | ---------- | --------- | ------------- | ---------- | ----- | -------- | ------------ | ----------------------- | ---------- |
| 1   | John       | Smith     | 123 Main St   | Anytown    | CA    | 12345    | 555-555-1212 | john.smith@email.com    | 1980-01-01 |
| 2   | Jane       | Doe       | 456 Second St | Anytown    | CA    | 12345    | NULL         | jane.doe@email.com      | 1990-02-02 |
| 3   | John       | Smith     | 789 Third St  | Othertown  | NY    | 67890    | 555-555-1212 | NULL                    | 03-12-1987 |
| 4   | Bob        | Johnson   | 234 Fourth St | Othertown  | NY    | 67890    | 555-555-1212 | bob.johnson@example.com | 1985-04-04 |
| 5   | Sarah      | Lee       | 567 Fifth St  | Thirdtown  | FL    | 45678    | 555-555-1212 | sarah.lee@invalidemail  | NULL       |
| 6   | David      | Kim       | 890 Sixth St  | Fourthtown | TX    | 34567    | 555-555-1212 | david.kim@email.com     | 1995-06-06 |
| 7   | John       | Smith     | 123 Main St   | Anytown    | CA    | NULL     | 555-555-1212 | john.smith@example.com  | 1980-01-01 |
| 8   | Jane       | Doe       | 456 Second St | Anytown    | CA    | 12345    | 555-555-1212 | jane.doe@invalidemail   | 02-02-1990 |
| 9   | John       | Smith     | 789 Third St  | Othertown  | NULL  | 67890    | 555-555-1212 | john.smith@email.com    | 1975-03-03 |
| 10  | Bob        | Johnson   | 234 Fourth St | Othertown  | NY    | NULL     | 555-555-1212 | bob.johnson@example.com | 1985-04-04 |

### Challenge Two:

In this [link](https://docs.google.com/spreadsheets/d/1q0cTH_bvofhrsPqAkciseXG4gDdUzk3qGlp44cRMFWc/edit#gid=457275569), you will find 2 tables, L1 (source table) and L2 (transformed table based on business requirements ) add it to local DB and share steps How did you do that?

You have to validate the output of the L2 and make sure this table meets the business requirements as follows:
We need to have one structured/cleaned table to build a Finance report for Service transactions, Attached are the required attributes with their logic in below table

Required column logic from source table condition

```sql
order_type	order_type	product_type = order_type
dim_group_id	dim_group_id	product_type = order_type
order_no	order_no	product_type = order_type
dim_bookingdate_id	dim_bookingdate_id	product_type = order_type
dim_store_id	dim_store_id	product_type = order_type
service_fee_code	product_name	product_type = 'rule'
dim_customer_id	dim_customer_id	product_type = order_type
dim_language	dim_language	product_type = order_type
dim_totals_currency	dim_totals_currency	product_type = order_type
dim_status_id	dim_status_id	product_type = order_type
phone	phone	product_type = order_type
payment_amount	payment_amount	product_type = order_type
discount_amount	discount_amount	product_type = order_type
service_fee_amount	service_fee_amount	product_type = order_type
base_amount	base_amount	product_type = order_type
inputvat	inputvat	product_type = order_type
outputvat	outputvat	product_type = order_type
product_vat	product_vat	product_type = order_type
selling_price	selling_price	product_type = order_type
selling_price_vat	selling_price_vat	product_type = order_type
ibv	ibv	product_type = order_type
iov_usd	ibv * conversion_rate_usd	product_type = order_type
gbv	gbv	product_type = order_type
gbv_usd	gbv * conversion_rate_usd	product_type = order_type
```

## What we are looking for:

A code we can Trust! This code is meant for testing, and passed execution does not mean a working application; maybe testing code needs to be tested in the first place.

Could you show your output for both questions in a proper QA report?

## Important points related to Delivery:

- Code challenge should be delivered as a link to a public git repository (github.com or bitbucket.com are preferred).
- Implementations focusing on **quality over feature completeness** will be highly appreciated. Don’t feel compelled to implement everything, while compromising on code quality.
- Even if you cannot complete the challenge, please submit it anyway.
