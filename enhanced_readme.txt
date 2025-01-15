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

### Installation Steps
1. Clone the repository:
   git clone [repository-url]

2. Install dependencies:
   mvn clean install

3. Run tests:
   mvn test

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

## Known Issues and Solutions
1. WebDriver Initialization
   - Issue: Driver not found
   - Solution: Ensure WebDriverManager is properly configured in testBase.java

2. Element Location
   - Issue: Elements not found during test execution
   - Solution: Verify element locators and implement appropriate wait conditions

3. Test Failures
   - Issue: Unexpected test failures
   - Solution: Check Screenshots directory for failure evidence and logs

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
[Your Name]

## License
This project is licensed under the MIT License - see the LICENSE file for details

## Acknowledgments
- Selenium WebDriver community
- TestNG framework
- CodenBox platform for the test environment

Note: This framework is specifically designed for testing CodenBox's registration functionality. For additional features or customizations, please refer to the documentation or raise an issue. 