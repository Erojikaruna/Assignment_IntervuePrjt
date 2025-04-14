Project Structure

1.GenericUtilities
  1.1 Property_Utility.java
  1.2 WebDriver_Utility.java
2. POM_Pages
  2.1 HomePomPage.java
  2.2 loginPomPage.java
  2.3 loginDetailPomPage.java
3. Login
   3.1 LoginTest.java
   3.2 Listeners
4. testData
    config.properties

 Prerequisites
1. Maven (optional but recommended)
2. Selenium (version:4.27.0)
3. TestNG(versrion:7.10.2)
4. ChromeDriver(version:135.0.7049.85) or EdgeDriver
5. A valid Intervue.io test account

Execution Steps
1.Navigate to Login/LoginTest.java
2.Run the file as a TestNg suite using your IDE or Run the TestExecution.xml  file

1. Launches browser specified in config
2. Navigates to Intervue.io
3. Clicks on login
4. Switches to login tab
5. Enters email and password
6. Hovers and verifies the login button
7. Logs results in TestNG Reporter
8. Closes the browser

