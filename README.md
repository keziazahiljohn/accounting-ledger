# Accounting Ledger

## Description of the Project

The Accounting Ledger is a program that allows the owner of a company to keep in check with their finances. Via menu option, the user can choose to add transactions or look up previous ones. This is really helpful for the owner to stay organized with their transactions.
## User Stories

As a customer, I want to be able to navigate a menu, so that I can choose a transaction or to view the ledger.

- Add Deposit
- Make a Payment
- Display Ledger
- Exit

As a user, I want to be able to view entries and do custom searches, so that I can narrow my search and save time.

- Display all entries
- View Deposits only
- View Payments only
- Run Report

As a user, I want to go even more specific with my search, so that I can find entries with the limited information I have.

- Search by Start Date 
- Search by End Date 
- Search by Description 
- Search by Vendor 
- Search by Amount

As a user, I want to run a report, so that I can view entries with more specifications.

- Month to Date
- Previous Month
- Year to Date
- Previous Year
- Search by Vendor
- Custom Search
- Back

As a user, I want to store my transactions in a file, so that I can reference them later.

- Transaction class
- Refer to other instances

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.
6. Utilize characters 'D', 'P', 'L', and 'X' to maneuver the main menu.
7. Continue to follow the prompts to either create a transaction or search for an existing one.

## Technologies Used

- Java: Amazon Corretto 17.0.18
- Time API
- IntelliJ IDEA

## Demo

![Deposit](deposit.gif)
![Payment](payment.gif)
![Ledger and Search](ledger.gif)

## Future Work

Potential future enhancements:

- Move methods to separate files as their own classes
- Improve UI or look and feel of the program
- Utilize database instead of file to store data
- Create version with GUI

## Resources
- https://www.w3schools.com/java/java_date.asp
- https://www.youtube.com/watch?v=F2bZ1fkAQx0&t=4s
- [Java Programming Tutorial](https://www.example.com)
- [Effective Java](https://www.example.com)

## Thanks

- Thank you to Raymond for continuous support and guidance.
- Shoutout to Ricky for helping me when I had questions.
 