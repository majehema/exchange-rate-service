# Spring Microservice Test Assignment


The goal is to demonstrate an "Exchange Rate Service". The service shall expose an API, which can be consumed 
by a frontend application.


## Set up

Unzip the file.
Open a terminal on the project folder.

Use maven to run the service:
``` 
mvn clean install 
```

Go to target dir and run:
``` 
java -jar exchange-rate-service-0.0.1-SNAPSHOT.jar
```

The service will run on the port 8000.

---
## How to use the service?
- To retrieve a list of supported currencies and see how many times they were requested, try:
  ```
  GET http://localhost:8000/api/currencies
  ```


- To retrieve the reference rate for a currency pair using the currency ID, try:
  ```
  /api/currency-exchange/from/{from_id}/to/{to_id}
  ```
  Example request (EUR to MXN):
  ```
  GET http://localhost:8000/api/currency-exchange/from/2/to/1
  ```

- To retrieve the reference rate for a currency pair using the abbreviation of the currencies, try:
  ```
  /api/currency-exchange/from-currency/{from_abbrev}/to-currency/{to_abbrev}
  ```
  Example request (EUR to MXN):
  ```
  GET http://localhost:8000/api/currency-exchange/from-currency/EUR/to-currency/MXN
  ```

- To convert an amount in a given currency to another, using the currency ID, try:
  ```
  /api/currency-exchange/from/{quantity}/{from_id}/to/{to_id}
  ```
  Example request (15 EUR = ??? GBP):
  ```
  GET http://localhost:8000/api/currency-exchange/from/15/2/to/4
  ```

- To convert an amount in a given currency to another, using the abbreviation of the currencies, try:
  ```
  /api/currency-exchange/from-currency/{quantity}/{from_abbrev}/to-currency/{to_abbrev}
  ```
  Example request (15 EUR = ??? GBP):
  ```
  GET http://localhost:8000/api/currency-exchange/from-currency/15/EUR/to-currency/GBP
  ```

- To retrieve a link to a public website showing an interactive chart, using the currency ID, try:
  ```
  /api/charts/from/{from_id}/to/{to_id}
  ```
  Example request (EUR to GBP):
  ```
  GET http://localhost:8000/api/charts/from/2/to/4
  ```

- To retrieve a link to a public website showing an interactive chart, using the abbreviation of the currencies, try:
  ```
  /api/charts/from-currency/{from_abbrev}/to-currency/{to_abbrev}
  ```
  Example request (EUR to USD):
  ```
  GET http://localhost:8000/api/charts/from-currency/EUR/to-currency/USD
  ```