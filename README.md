Automation Exercise - Web Automation Testing

Introduction

This project is an automated testing project for the Automation Exercise web application.

The project uses Selenium WebDriver, Java, TestNG, and Page Object Model (POM) to automate key user workflows and verify the functionality of the application.

Application Under Test

Website: https://automationexercise.com/

Technologies & Tools

* Java
* Selenium WebDriver
* TestNG
* Maven
* Eclipse
* Git & GitHub
* Page Object Model (POM)
* WebDriverWait
* Actions

Project Structure

src
└── test
    └── java
        ├── base
        │   └── BaseClass.java
        ├── pages
        │   ├── LoginPage.java
        │   ├── SignupPage.java
        │   ├── ProductsPage.java
        │   ├── CartPage.java
        │   └── CheckoutPage.java
        └── tests
            ├── SignupTest.java
            ├── LoginTest.java
            ├── PurchaseProduct.java
            └── RemoveAllProducts.java

Automated Workflows

Workflow 1 - Purchase Product

1. Login with valid credentials
2. Search for a product
3. Open product details
4. Verify product name
5. Verify product price
6. Enter product quantity
7. Add product to cart
8. Open cart
9. Proceed to checkout
10. Enter payment details
11. Place the order
12. Verify “Order Placed!” message

Workflow 2 - Remove All Products

1. Login with valid credentials
2. Add three products to the cart
3. Open the cart
4. Get delete icons as a List
5. Hover and click the delete icon
6. Use a while loop until all products are removed
7. Verify “Cart is empty!”
8. Logout
9. Verify the Login page is displayed

Test Coverage

The project covers:

* Signup
* Login
* Product search
* Product details
* Product quantity
* Add to cart
* Multiple products
* Shopping cart
* Product deletion
* Checkout
* Payment details
* Order placement
* Order confirmation
* Logout

Testing Approach

The automation framework uses:

* Page Object Model (POM) for maintainable test code.
* TestNG for test execution and assertions.
* WebDriverWait for synchronization.
* Actions class for mouse interactions.
* List and while loop for removing multiple products dynamically.
* Assertions to verify expected results.

Test Data

The project uses test data only. No real payment transactions are performed.

Features Not Covered

* Real payment transactions
* Database testing
* Backend/API testing
* Email notification verification
* Accessibility testing

How to Run

1. Clone the repository.
2. Open the project in Eclipse.
3. Make sure Java and Maven are configured.
4. Update Maven dependencies.
5. Run the TestNG test classes or the TestNG suite.
6. Chrome browser will open automatically during execution.

Author

Sara Abualwafa

Project Type

Web Application Automation Testing
