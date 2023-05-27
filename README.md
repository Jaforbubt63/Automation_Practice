# Automation_Practice
 
Sample (automationpractice.com) website automation project with selenium java

## Use Selenium WebDriver to Automate the following scenario:

1. Visit the given URL: https://test.sharebus.co/
2. Navigate to LoginPage by clicking "Sign in" button
3. Login with email("brainstation23@yopmail.com") and password("Pass@1234")
4. Select user as "Sharelead" from menu options

5. Click "Set Up a ShareBus" button
6. Insert required Trips details and click "Continue" [Please use location address as: From="Oslo, Norway" and To="Kolbotn, Norway"]
7. On Membership page click "Yes" and select "NTNUI" club and click "Continue"
8. Need any ticket for himself? click on "No" button
9. Activate ticket discounts? click "No" button
10. Click on the "Create ShareBus" button
11. Click on the "Publish" button
12. Insert data on required fields
13. Click on the "Review and publish" button
14. Click on the "Publish" button
15. Click on the "my busses" from navbar
16. Verify that the new Trip is displayed on the "My busses" page


This project covers the following topics:

1.Java

2.Maven

3.Selenium

4.TestNG

5.Page Object Model

6.Data-Driven

7.Page Factory

8.Allure Report

Command for run allure report

Method 1

alllure serve [abs path of allure-results]

Method 2

Gnerating report: allure generate ./allure-results --clean

Display report using server: allure open ./allure-report

Git command
Clean git cached command: git rm -rf --cached .
