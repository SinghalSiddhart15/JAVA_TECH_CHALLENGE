All the packages and related JAVA files can be found in web13 -> src -> com -> avengers / com -> siddhart


Link to Online Data base : jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6163809

This is project integrates Appdirect API's with the web applications 'web13' running on local system and hosted on ngrok,
The project has servlets which are helping to integrate our application by providing cerate and cancel subscription handling 
controllers.

This project is created by Siddhart Singhal.

It mainly has 6 packages:

1) Dao:-the package has the functionality that interacts with underlying database, it has the classes that create and insert the values that are retrieved from the json.

2)Bean:-this package has the classes that carries the getter and setters for the values thus retrieved from the json.

3)Controller:-this package has two sevelets one for creating subscription and another one for deleting or suspending the subscription the controller also calls other packages to provide the integerated functionality.

4)Domain:-this package has the userdetails domain class to retrieve the desired data that needs to be stored in the database.

5)Service:- this is the package that has the intermediatory functionality that interacts with the database and calls the database to the servelet.

6)Utils:-this is the package that has the code for providing authentication to the product,also the code to map the json and a collection class that contains the calling and setting of the values that are to be stored in the database.


DATABASE:- It contains the 4 tables that stores the values retrieved from the json and accountidentifier as the primary key in
all 4 tables.

1). Account:- has the account details of the creator.
2).Creator:- has all the details for the user.
3). Company:- has the details of the company from which the user has bought the product.
4). OrderProduct:- contains the details of the product and type of the pricing.
