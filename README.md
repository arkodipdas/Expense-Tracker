Expense Tracker
An Expense Tracker application built using Java, Spring Boot, ReactJS, and H2 Database. This application helps users manage their daily expenses, set budgets, and view insights into their spending habits.

Table of Contents
Features
Technologies Used
Getting Started
Installation
Usage
API Endpoints
Screenshots
Future Enhancements
Contributing
License
Features
Add Expense: Record and categorize expenses with custom tags, notes, and timestamps.
View Expense History: Retrieve a history of all logged expenses, with filtering and sorting options.
Dashboard: Provides insights into spending patterns and categories.
Set Budget: Set a monthly budget and get notifications when nearing the limit.
Search Functionality: Search through expenses by category, date, or keywords.
User Authentication: Secure login and registration to keep data private.

Technologies Used
Backend: Java, Spring Boot
Frontend: ReactJS
Database: H2 (in-memory database for development and testing)
Build Tools: Maven
Other: RESTful APIs, JSON Web Tokens (JWT) for authentication

Getting Started
To set up the project locally, ensure you have the following installed:

Java (JDK 11+)
Maven (for backend dependencies)
Clone this repository:

git clone https://github.com/your-username/expense-tracker.git
cd expense-tracker
Installation
Backend (Spring Boot)


Database
The application uses an in-memory H2 database. By default, it runs on http://localhost:8080/h2-console and can be accessed with the default credentials defined in application.properties.

Usage
Open your browser and navigate to http://localhost:3000.
Register a new user or log in with existing credentials.
Start adding, viewing, and managing your expenses!

Screenshots

![Expense tracker](https://github.com/user-attachments/assets/167be5e3-9958-4a9b-8903-0221ab72790a)

Future Enhancements
Add reporting and exporting (PDF/Excel) functionality
Add reminders for recurring expenses
Implement support for multiple currencies
Integrate with external APIs for currency conversion
Contributing
Contributions are welcome! Please fork this repository and submit a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.
