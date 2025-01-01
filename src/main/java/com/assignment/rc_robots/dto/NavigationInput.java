package com.assignment.rc_robots.dto;


import java.util.List;


public class NavigationInput {
    private int maxX;
    private int maxY;
    private List<RobotInstruction> instructions;


    // All Argument constructor
    public NavigationInput(int maxX, int maxY, List<RobotInstruction> instructions) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.instructions = instructions;
    }

    // Setter for maxX
    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    // Getter for maxX
    public int getMaxX() {
        return maxX;
    }

    // Getter for maxY
    public int getMaxY() {
        return maxY;
    }

    // Setter for maxY
    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    // Getter for instructions
    public List<RobotInstruction> getInstructions() {
        return instructions;
    }

    // Setter for instructions
    public void setInstructions(List<RobotInstruction> instructions) {
        this.instructions = instructions;
    }

    // toString() Method
    @Override
    public String toString() {
        return "NavigationInput{" +
                "maxX=" + maxX +
                ", maxY=" + maxY +
                ", instructions=" + instructions +
                '}';
    }
}
