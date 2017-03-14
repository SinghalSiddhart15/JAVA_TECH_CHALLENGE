This is project integrates Appdirect API's with the web applications 'web13' running on local system and hosted on ngrok,
The project has servlets which are helping to integrate our application by providing cerate and cancel subscription handling 
controllers.

This project is created by Siddhart Singhal.
It mainly has 7 packages:

1) Dao:-the package has the functionality that interacts with underlying database, it has the classes that create and insert the values 
		that are retrieved from the json.
2) bean:-this package has the classes that carries the getter and setters for the values thus retrieved from the json.

3) controller:-this package has two sevelets one for creating subscription and another one for deleting or suspending the subscription
			the controller also calls other packages to provide the integerated functionality.
4) domain:-this package has the userdetails domain class to retrieve the desired data that needs to be stored in the database.

5) model:-this has the model class that has two attributes that are required to handle the request and response of the servelet.

6) service:- this is the package that has the intermediatory functionality that interacts with the database and calls the database 
			to the servelet.
7) utils:-this is the package that has the code for providing authentication to the product,also the code to map the json and a 
			collection class that contains the calling and setting of the values that are to be stored in the database.


DATABASE:- it contains the 4 tables that stores the values retrieved from the json and accountidentifier as the primary key in
			all 4 tables.

1). Account:- has the account details of the creator.
2).Creator:- has all the details for the user.
3). Company:- has the details of the company from which the user has bought the product.
4). OrderProduct:- contains the details of the product and type of the pricing.
