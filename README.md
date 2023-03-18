# Game Score Management
 This is a Spring Boot project for managing game scores for players. The project uses the following tech stacks:

Java 17
Spring Boot 3
Spring Data JPA
H2 Database
Maven (for dependency management)
Design Pattern
The project follows the Model-View-Controller (MVC) design pattern, where:

The Model is represented by the Game and GameScore entities, which are persisted in the H2 database using Spring Data JPA.
The View is represented by the API endpoints defined in the GameController and GameScoreController classes, which expose the data as JSON responses.
The Controller is represented by the GameService and GameScoreService classes, which encapsulate the business logic and interact with the repositories to retrieve or update data.
Running the Project
To run the project, you need to have Java 11 and Maven installed on your machine. Then, you can follow these steps:

Clone the repository to your local machine:
bash
Copy code
git clone https://github.com/your_username/game-score-management.git
Navigate to the project directory:
bash
Copy code
cd game-score-management







