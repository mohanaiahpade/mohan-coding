# Employee Management System :office:

An __Employee Management System__ built using __Spring Boot technologies__, __Thymeleaf views__, __JPA__, __MySQL Database__, and more. The project features Spring Model, View, and Controller (MVC) architecture and Service and Repository layers.

This project is built for the intention of keeping track of employees within a company. The manager is able to add, delete, and update employees and input employee data based on their name, position, and manager. This application can be modified to include more information. The list of employees is able to be sorted based on name, position, and manager (in ascending or descending order), and the list is divided into 10 employee each pages to organize the application. The system uses a MySQL Database to store the employee data.

**Preview images** :small_red_triangle_down:
<details>
<summary>Some images of the application </summary>

* Welcome Page

![Welcome](https://github.com/NotTheBest/employee-management/blob/master/preview-images/welcome.png?raw=true)

* Home

![Home1](https://github.com/NotTheBest/employee-management/blob/master/preview-images/home1.png?raw=true)

* Home (Page 2 with different sort)

![Home2](https://github.com/NotTheBest/employee-management/blob/master/preview-images/home2.png?raw=true)

</details>

## Running the application locally

The Employee Management System is a Spring Boot application built using Maven. You can build a jar file and run it from the command line:

```
git clone https://github.com/NotTheBest/employee-management.git
cd employee-management
./mvnw package
java -jar target/*.jar
```
You can then access the application here: http://localhost:8080/

![Home1](https://github.com/NotTheBest/employee-management/blob/master/preview-images/home1.png?raw=true)

Or you can run it from Maven directly using the Spring Boot Maven plugin.

```
./mvnw spring-boot:run
```

## Database Configuration
This project uses __MySQL Database__. In order to connect with the database, edit 

```
spring.datasource.username=root
spring.datasource.password=password
```
within __application.properties__ to match your local MySQL database's username and password.

The application will create a new database named __employeemanagement__. If you would like to change the name of the database, edit the appropriate database url within __application.properties__ as you would like it.

## About

This project was a personal project to learn more about Spring development, database management, and industry application architecture.

A small summary of the skills showcased during this project: :small_red_triangle_down:

* Java Spring Core, HTML5, CSS and similar topics
* Spring MVC Controller and View management & annotations
* Spring Boot capabilities, annotations, usage, and deployment
* Thymeleaf technology, syntax, usage, capabilities, more
* Client/Server data transfer
* JPA annotations and repository management
* MySQL database management with Spring Data JPA
* Software/web application development processes
* MVC architecture along with DAO, model, service layers, and similar
* Accessibility, web design, and form management with Thymeleaf and controllers
* Pagination and organized data view techniques
* Web application debugging
* Common resturant positions :sushi:
* More! :)
