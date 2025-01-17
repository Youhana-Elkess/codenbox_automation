# Selenium Test Automation Framework - CodenBox Registration

## Overview
This automation framework is designed to test the registration functionality of CodenBox's web application. Built using Selenium WebDriver, Java, and TestNG, it implements the Page Object Model design pattern for maintainable and scalable test automation.

## Project Structure
project-root/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Pages/
│   │           ├── pageBase.java        # Base class with common UI interactions
│   │           └── userRegister.java    # Registration page elements and actions
│   └── test/
│       ├── java/
│       │   └── Tests/
│       │       ├── Registeration.java   # Registration test scenarios
│       │       └── testBase.java        # Test configuration and setup
│       └── utilities/
│           └── Helpers.java             # Utility functions for screenshots
├── Screenshots/                         # Test failure screenshots
└── pom.xml                             # Maven dependencies and build config

## Key Features
- ✅ Page Object Model design pattern
- 📸 Automatic screenshot capture on test failures
- ⚙️ Configuration-driven testing
- 🔄 Reusable components
- 📊 TestNG test reporting
- 🌐 Chrome browser support
- 🔍 Explicit wait implementations
- 📝 Detailed failure logging

## Test Coverage
The framework currently tests:
1. User Registration Flow
   - Form field validations
   - Course selection functionality
   - Month selection
   - Form submission
   - Success message verification

## Components Description

### Pages
- userRegister.java
  - Implements registration form elements
  - Handles form interactions
  - Validates registration success
  - Uses Page Factory for element initialization

- pageBase.java
  - Base page class with common methods
  - Handles JavaScript execution
  - Manages Actions class instances
  - Implements scrolling functionality

### Tests
- Registeration.java
  - Contains test scenarios
  - Implements data-driven testing
  - Handles test flow execution
  - Includes assertions and validations

- testBase.java
  - Manages WebDriver setup
  - Handles test configuration
  - Implements screenshot capture
  - Controls browser initialization

### Utilities
- Helpers.java
  - Screenshot capture functionality
  - File handling utilities
  - Error logging capabilities

## Setup Instructions

### Prerequisites
- Java JDK 11 or higher
- Maven 3.6+
- Chrome Browser
- IDE (recommended: VS Code, Eclipse, or IntelliJ)

## Logging
The framework includes logging capabilities using Log4j. This allows for tracking the execution flow of tests and capturing important information during test runs.

### Log4j Configuration
A Log4j configuration file (`log4j2.xml`) is located in the `src/test/resources` directory. This file defines the logging behavior, including the output format and log levels.

### Example of Logging in Tests
In the `Registeration` class, logging statements have been added to track the progress of the test execution:

## Dependencies
- Selenium WebDriver: 4.21.0
- TestNG: 7.8.0
- WebDriverManager: 5.6.3
- Apache POI: 3.17

## Best Practices Implemented
- ✨ Clean and maintainable code structure
- 🏗️ Page Object Model implementation
- 🔄 Reusable methods and utilities
- 📝 Proper exception handling
- 📸 Failure documentation with screenshots
- ⚡ Efficient element locators
- ⏱️ Appropriate wait strategies

## Reporting
- TestNG HTML reports generated after test execution
- Failure screenshots stored in Screenshots directory
- Console logs for test execution tracking


## Future Enhancements
- [ ] Add support for multiple browsers
- [ ] Implement API testing integration
- [ ] Add data-driven testing capabilities
- [ ] Enhance reporting with Extent Reports
- [ ] Add CI/CD pipeline integration

## Contributing Guidelines
1. Fork the repository
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some AmazingFeature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

## Author
[Youhana Refat]

