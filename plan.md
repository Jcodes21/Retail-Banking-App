A retail banking app allowing users to deposit, update withdraw and transfer funds.
A seperate URL is used as a cash flow handler its UI that manages transactions like atm withdrawals. This handler stores data in the database and calls the retail banking apps API.

## Functional requirements


## Non functional requirements
### Performance 
 - API response time
 - System supports concurrent users
### Scalability
### Security
  Authentication and authorisiation
    - JWT based authentication
    - Input sanitation

  HTTP/TLS
### uptime
 - Rate limiting
### Data consistency & integrity

Audit logging

# user stories
As a user I can:
Login / Logout
create / close account 
view account details 
view balance
download statement .csv
freeze / unfreeze account
deposit funds into my account
transfer funds internally between own accounts
transfer funds externally to another person/business account
add and manage transfer payees
View transaction history 

## Tech stack
Springboot 
Project: Maven
Language: Java
Spring Boot: 3.x
Group: com.jcodes21
Artifact: retail-banking-app
Package name: com.jcodes21.retailbankingapp
Packaging: Jar
Config: Properties
Java: 17
Dependencies: Spring Web
React

Postgres 
Hibernate ORM integrates via Spring Data JPA

Auth
bcrypt
JWT

## database
user table
id (PK)
firstname
lastname
middle name
date of birth
address
email
username
password
is_frozen
is_active
created at

account table
id (PK)
balance
user id (FK users table)
account type
account number
sort code
created at

transaction table
id (PK)
account_id (FK)
type (DEPOSIT, WITHDRAWAL, TRANSFER)
amount
direction (CREDIT | DEBIT)
status (PENDING, COMPLETED, FAILED)
reference_id (for linking transfer pairs)
counterparty_account (nullable)
description
created_at

payee table
id (PK)
user_id: (FK)
String firstname:
String lastname:
String accountnumber:
String sortcode:





# API
endpoints
GET balance
POST deposit
POST withdrawal
GET transfer
POST transfer
GET Transaction history
UPDATE password



be extremely concise, very!


