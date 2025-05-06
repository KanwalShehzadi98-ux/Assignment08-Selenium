•	Create a project and maintain Page Object Model in it.
•	Created a new Maven project in Eclipse.
•	Added Selenium WebDriver and TestNG dependencies in the pom.xml file.
•	Followed the Page Object Model (POM) design pattern by organizing the code into:
•	base/ package for browser setup (BaseTest.java)
•	pages/ package for page classes (HomePage.java, SearchResultsPage.java, ProductPage.java)
•	tests/ package for test classes (DarazTest.java)
 
 
•	Navigate to https://www.daraz.pk/
•	Initialized the WebDriver in the BaseTest.java class.
•	Opened the Daraz website by calling driver.get("https://www.daraz.pk/").
•	Maximized the browser window using driver.manage().window().maximize().
•	Added an implicit wait to handle dynamic elements and page load delays.

 

 


 

 

•	Search for a particular item e.g. “electronics”.

 

 

 

4. Choose anyone “Brand” from the filter checkbox
 
 
 
5. From the filters, enter minimum price 500 and maximum price 5000 and apply the filter.
 
 
 
6.	Results will be loaded, write a method to find the count (number of) products loaded in the results. Call this method from a testcase, the test should pass in case of count greater than 0, else it should fail.
 
 
7.	Click on any one product from the results.
 
 
8.	Write a testcase to find out if free shipping is available for the product or not; if free shipping is available, pass the test, else the testcase should fail.
 
