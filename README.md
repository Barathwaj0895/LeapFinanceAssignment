Framework designed and Developed by 
**Mr. Barathwaj Ravisankar Senior Software Development Engineer in Test**

It is a skeleton framework for given Assignment
The framework has been developed with POM Design Pattern
TestNG as Unit Test Framework
Java as Programming Language and Selenium as Automation tool for web applications

Overview of Framework
 1. Since we need to use same methods multiple time in different sent of scenarios
 2. So as per POM we have cleared dependencies using mvnrepository.com
 3. All the method has been parameterized, we can use it multiple times according to scenarios we develop/test
 4. TestNG is the unit test Framework used where we have annotations and based on that we design the test suite and how to run the classes, methods via testng.xml file.
 5. ExtentReports used for Report Generation.
 6. GitHub Actions used for deploying and running the code in given test environments.
 7. Build Tool used was Maven
 8. Test execution can also be done using Maven Commands.
 9. Driver initialization is via WebDriverManager class so no need of Physical drivers.
MVN Commands
    mvn test -Dtest=”TestClassName"
 e.g. mvn test -Dtest="QualifiedSlot1userAutoLSPlus"

Can be done:
1. Jenkins can be used for CI/CD pipeline build
2. Gradle can be used as build Tool
3. MVC Design Pattern can be used.
4. Cross Browser Testing("BrowserStack") and Parallel execution can be done.
