package com.assignment.rc_robots.model;


public class Robot {
    private int x;
    private int y;
    private char direction;


    // All Argument constructor
    public Robot(int x,int y,char direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Setter for X
    public void setX(int x){
        this.x = x;
    }

    // Getter for X
    public int getX(){
        return x;
    }

    // Setter for Y
    public void setY(int y){
        this.y = y;
    }

    // Getter for Y
    public int getY(){
        return y;
    }

    // Setter for Direction
    public void setDirection(char direction){
        this.direction = direction;
    }

    // Getter for Direction
    public char getDirection() {
        return direction;
    }

    // toString() Method
    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
