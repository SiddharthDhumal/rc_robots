**RC Robots**

This project simulates a squad of Remote-Controlled (RC) Robots to be operated by ACME Co. in their warehouse. The robots are navigating this curiously rectangular warehouse so their onboard cameras can get a complete view of their surroundings.

**Features**

The robots can move forward, turn left, or turn right.
The robot's position and direction are updated based on a series of instructions.
The movement is restricted within the warehouse grid, with boundaries defined by the upper-right coordinates.
Technologies Used
Java 17
Spring Boot 3.4.1
Spring Web
Maven (for dependency management)
Project Structure
The project follows a simple layered architecture:

Controller: Handles incoming HTTP requests and coordinates the processing.
Service: Contains the business logic for robot movements and command processing.
Model: Defines the structure of a Robot and its Direction as an enum.
DTO (Data Transfer Object): Represents the data structure for input and output.

**Endpoints**
1. /robots/navigate - POST
Description: This endpoint receives a list of robot instructions and processes each robot's movements according to the commands provided. It returns the final position and direction for each robot.

**Input :**

Request Body (JSON)
{

    "maxX": 5,
    "maxY": 5,
    
    "instructions": [
      
        {
        
            "x": 1,
            "y": 0,
            "direction": "N",
            "commands": "MMRMMLMMR"
        },
        {
            "x": 3,
            "y": 2,
            "direction": "E",
            "commands": "MLLMMRMM"
        }
    ]
}


maxX: The upper-right x-coordinate of the warehouse. 

maxY: The upper-right y-coordinate of the warehouse.

instructions: A list of robots, each containing:
x: Initial x-coordinate. y: Initial y-coordinate.

direction:(N, E, S, W).

commands: A string of commands (M means move forward  one grid point, and maintain the same
heading., L means the robot spins 90 degrees right without
moving from its current spot, and R means the robot spins 90 degrees right without
moving from its current spot).

 Output :
[

  "3 4 E",
   
  "2 4 N"
  
]

Each string in the response contains the final x-coordinate, y-coordinate, and direction of each robot.

**Setup and Installation**

Prerequisites
Java 17 and
Maven 4.0.0 (for dependency management)

Steps to Run the Application

Clone the Repository:


git clone https://github.com/SiddharthDhumal/rc_robots.git

Build the Project:

If you have Maven installed, run the following command to build the project:

mvn clean install

Run the Application:

You can run the application using the following Maven command:

mvn spring-boot:run

The application will start on http://localhost:8081 by default.

Example of Running the Application

To test the endpoint using curl, you can send a POST request with the following example:


curl -X POST http://localhost:8081/robots/navigate \
  -H "Content-Type: application/json" \
  -d '{
  
        "maxX": 5,
        "maxY": 5,
        "instructions": [
        
          {
            "x": 1,
            "y": 0,
            "direction": "N",
            "commands": "MMRMMLMMR"
          },
          
          {
            "x": 3,
            "y": 2,
            "direction": "E",
            "commands": "MLLMMRMM"
          }
        ]
      }'

Output: 

 ![result for rc_robot inputs](https://github.com/user-attachments/assets/eccb5802-336e-41b0-92fd-49d787280df6)


Notes
The warehouse is represented as a grid where (0,0) is the bottom-left corner, and (maxX, maxY) is the upper-right corner.
The robot's position is constrained within the warehouse grid, so it will not move outside the grid boundaries.
The robot's heading is updated according to the commands it receives (left, right, or move forward).


