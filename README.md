
# Restful-Booker API Testing with Katalon Studio

## Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Project Structure](#project-structure)
4. [Steps to Test](#steps-to-test)
5. [Environment Configuration](#environment-configuration)
6. [Test Scenarios](#test-scenarios)
7. [Reporting](#reporting)
8. [Troubleshooting](#troubleshooting)

---

## Introduction
This document provides a step-by-step guide for testing the **Restful-Booker API** using **Katalon Studio**. Restful-Booker is a simple application that provides various endpoints for CRUD operations on booking entities.

---

## Prerequisites
Before starting, ensure the following:
- **Katalon Studio** is installed.
- Access to the Restful-Booker API documentation at [https://restful-booker.herokuapp.com/apidoc](https://restful-booker.herokuapp.com/apidoc).

---

## Project Structure
The suggested project structure in Katalon Studio for API testing:

```
/Object Repository
  ├── /API Requests
      ├── CreateBooking
      ├── GetBooking
      ├── UpdateBooking
      ├── DeleteBooking
      └── Auth
/Test Cases
  ├── Create Booking
  ├── Get Booking
  ├── Update Booking
  └── Delete Booking
/Test Suites
  ├── Booking Tests
  └── Auth Tests
/Reports
  └── [Execution Reports]
/Profiles
  └── default
```

---

## Steps to Test

### 1. Create a New Project
1. Open **Katalon Studio**.
2. Select **File > New > Project**.
3. Enter a project name, e.g., `Restful-Booker-API-Testing`.
4. Click **OK** to create the project.

### 2. Add API Requests
1. Right-click on **Object Repository**.
2. Select **New > Web Service Request**.
3. Name the request, e.g., `CreateBooking`.
4. Choose **RESTful** as the request type.
5. Enter the endpoint URL, e.g., `https://restful-booker.herokuapp.com/booking`.
6. Select the appropriate HTTP method (e.g., `POST`).
7. Add headers and body as per the API documentation.

### 3. Create Test Cases
1. Right-click on **Test Cases**.
2. Select **New > Test Case**.
3. Name the test case, e.g., `Create Booking`.
4. Click **OK**.
5. In the test case editor, add steps to send requests and validate responses:
   ```groovy
   def response = WS.sendRequest(findTestObject('Object Repository/API Requests/CreateBooking'))
   WS.verifyResponseStatusCode(response, 200)
   ```

### 4. Run Test Cases
1. Right-click on the test case to execute.
2. Select **Run > Web Service Request**.
3. Check the execution result in the **Log Viewer** tab.

---

## Environment Configuration
To manage global variables like `baseURL`, use Katalon Studio's **Profiles** feature:
1. Go to **Profiles > default**.
2. Add a variable `baseURL` with the value `https://restful-booker.herokuapp.com`.
3. Use `GlobalVariable.baseURL` in requests for dynamic reference.

---

## Test Scenarios
Here are the common test scenarios for the Restful-Booker API:

| **Scenario**          | **Endpoint**             | **Method** | **Description**                              |
|------------------------|--------------------------|------------|----------------------------------------------|
| Create Booking         | `/booking`               | POST       | Create a new booking                         |
| Get Booking            | `/booking/{id}`          | GET        | Retrieve booking details by ID               |
| Update Booking         | `/booking/{id}`          | PUT        | Update an existing booking                   |
| Delete Booking         | `/booking/{id}`          | DELETE     | Delete a booking                             |
| Authentication         | `/auth`                  | POST       | Obtain a token for protected operations      |

---

## Reporting
After executing test cases, reports can be found in the `/Reports` folder. These include:
- HTML Reports: Provide detailed execution logs.
- Logs: For debugging errors and failures.

---

## Troubleshooting
| **Issue**                      | **Possible Cause**                   | **Solution**                                 |
|--------------------------------|---------------------------------------|---------------------------------------------|
| `401 Unauthorized`             | Invalid authentication token         | Ensure the correct token is included        |
| `404 Not Found`                | Incorrect endpoint or missing resource| Verify the endpoint and resource ID         |
| `500 Internal Server Error`    | Server-side issue                    | Check API payload and retry later           |
| Timeout errors in test scripts | Slow API response                    | Increase timeout settings in Katalon Studio |

---

For more information, visit the [Restful-Booker API Documentation](https://restful-booker.herokuapp.com/apidoc).
