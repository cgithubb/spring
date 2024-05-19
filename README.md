# Hello Application  

Dependencies Used

1. Spring Web
2. Spring JDBC (Hikari)
3. Spring H2 and Lombok

Dependencies to be added 

1. Spring PostgreSql


check POM.XML for all the dependencies used


-> WORKING__

--> App starting point within HelloApplication.java file annotated as @SpringBootApplication

checks for all classes with @Configuration and @Component [Beans] and their dependencies
Loads them into application context and injected with constructor.

@Autowired is not used anywhere.

-> Database

main.sql file located in [main/resources] is used to load H2 container with EMPLY table.
configured in application.yml file as [sql: init: data-locations].

-> SETUP__
download code to local and setup IDE (INTELIJ or Eclipse) with Spring Tools.

go to folder location and run maven clean and maven install to download dependencies. or import as maven project and build using IDE.

Load the Jar file.

Start the application using Tomcat.



#TODO 
-> include PostgreSQL as main database and use a remote hosting
