package com.assignment.rc_robots.dto;



public class RobotInstruction {
    private int x;
    private int y;
    private char direction;
    private String commands;


    // All Argument constructor
    public RobotInstruction(int x, int y, char direction, String commands) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.commands = commands;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Getter for direction
    public char getDirection() {
        return direction;
    }

    // Setter for direction
    public void setDirection(char direction) {
        this.direction = direction;
    }

    // Getter for commands
    public String getCommands() {
        return commands;
    }

    // Setter for commands
    public void setCommands(String commands) {
        this.commands = commands;
    }

    // toString() Method
    @Override
    public String toString() {
        return "RobotInstruction{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                ", commands='" + commands + '\'' +
                '}';
    }
}
