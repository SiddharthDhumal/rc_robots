package com.assignment.rc_robots.service;

import com.assignment.rc_robots.model.Robot;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    public Robot instructionsToFollow(Robot robot,String instructions,int maxX,int maxY){

        //for processing each instruction in the string
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'R':
                    robot.setDirection(rightTurn(robot.getDirection()));
                    break;
                case 'L':
                    robot.setDirection(leftTurn(robot.getDirection()));
                    break;
                case 'M':
                    moveForward(robot, maxX, maxY);
                    break;
            }
        }
        return robot;
    }

    // for left side turn
    private char leftTurn(char direction) {
        return switch (direction) {
            case 'E' -> 'N';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'N' -> 'W';
            default -> direction;
        };
    }

    // for right side turn
    private char rightTurn(char direction) {
        return switch(direction){
            case 'E' -> 'S';
            case 'W' -> 'N';
            case 'S' -> 'W';
            case 'N' -> 'E';
            default -> direction;
        };
    }

    // for moving ahead
    private void moveForward(Robot robot, int maxX, int maxY) {
        switch (robot.getDirection()) {
            case 'E': // Move to East
                if (robot.getX() < maxX) robot.setX(robot.getX() + 1);
                break;
            case 'W': // Move to West
                if (robot.getX() > 0) robot.setX(robot.getX() - 1);
                break;
            case 'S': // Move to South
                if (robot.getY() > 0) robot.setY(robot.getY() - 1);
                break;
            case 'N': // Move to North
                if (robot.getY() < maxY) robot.setY(robot.getY() + 1);
                break;
        }
    }


}
