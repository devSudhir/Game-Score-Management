<br/>
<p align="center">
  <h3 align="center">Game Score Management</h3>

  <p align="center">
    This is a Spring Boot project for managing game scores for players.

    
## Table Of Contents

* [Tech Stacks](#Tech-Stacks)
* [Design Pattern](#Design-Pattern)
* [Getting Started](#getting-started)
  * [API Documentation](#API-Documentation)
* [Usage](#usage)
* [Limitation](#limitation)

## Tech Stacks
* Java 17
* Spring Boot 3 
* Spring Data JPA 
* H2 Database 
* Maven (for dependency management)


## Design Pattern

The project follows the Model-View-Controller (MVC) design pattern, where:

The Model is represented by the Player, Game and Score entities, which are persisted in the H2 database using Spring Data JPA. The View is represented by the API endpoints defined in the PlayerController, GameController and ScoreController classes, which expose the data as JSON responses. The Controller is represented by the PlayerService, GameService and ScoreService classes, which encapsulate the business logic and interact with the repositories to retrieve or update data. Running the Project To run the project, you need to have Java 17 and Maven installed on your machine.

## Getting Started

* Clone the repository to your local machine: 
https://github.com/devSudhir/Game-Score-Management.git
* Navigate to the project directory : <prject path>\ManagementApplication.java
* Example :- D:\Game Project\management\Game-Score-Management\management\src\main\java\com\game\score\management\ManagementApplication.java
* Run it.

## Usage
 * use postman to hit api 
* Providing postman collection link 
Please refer to the [Postman](https://drive.google.com/file/d/1yMEAwjJWbVo_sf4lpDgFoD2vP-fkbWHa/view?usp=sharing)

##### Steps
* Create Players
* Create Games
* Create Score Related to game and player
* Hit required api to see the results

### Limitation
* Projects uses H2 in memory database, so data will be vanished when you restart or stop the application.
* No validation and logger is implemented here. Application may throw exception if you want to hit apis with invalid data.
