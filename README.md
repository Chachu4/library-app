# Library Application- Java application which provides books management functionalities## Development environmentRequired- Git client- Java SE 8- Maven 3.6+## Library functional acceptance criteria- Library contains books to lend (at the beginning there are no books in the library)- Book consist of title, year and author.- Each book should have unique identifier (ID) across application.- Should be possible to add a new book to the library. ID should not be passed as an argument. ID should be generated inside the Library.- Should be possible to remove the given book from the library (by ID) (such action should be possible only if the book with such ID exists and it is not currently lent).- Should allow to list all books in the library (distinctly). Returned information should contain information how many is available or lent. The System.out.println can be used.- Should allow to search book by title, author, year (also other combinations like title AND author).- Should allow to lend a book by ID (should be forbidden if a copy with the given ID is already lent). Should allow to pass the name of the person who lent the book.- Should allow to see all book's details by ID (title, author, year, information if it is available or lent together with person name).## ImplementationThe library application- does not contain any user interface- manages data using collections and streams (based on the non-functional requirements no database has been set up, and neither JDBC nor Hibernate has been utilized to manage data persistence)- has been developed without Spring and Hibernate- logging has been replaced with a simple System.out.println function- book search functions are not case sensitive and do not look for an explicit value, but for records containing the provided search parameter (except for the year search, which compares complete field values)- unit tests have been developed using JUnit5## Unit tests executionUnits tests can be run using Maven ```bash$ mvn clean test```## Running<br>Please note that inside the main method there has been provided a method demonstrating a possible use of the app (also the cases, which cause InvalidIdException have been introduced on purpose). The demo should be replaced with  the personalized version of the app utilization. <br/>   <br>After making any changes and prior to the app execution, the   project should be rebuilt using the following command:<br/>   ```bash  $ mvn clean install  ```The application execution should be performed using local environment. There are two main ways to run the application manually:  * as an executable JAR archive ```bash$java -jar target/library-1.0.jar```* through Maven plugin> for macOS ```bash$ mvn exec:java -Dexec.mainClass="com.atos.library.App"```> for Windows ```bash$ mvn exec:java -D"exec.mainClass"="com.atos.library.App"```