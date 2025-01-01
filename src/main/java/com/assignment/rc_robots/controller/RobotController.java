package com.assignment.rc_robots.controller;

import com.assignment.rc_robots.dto.NavigationInput;
import com.assignment.rc_robots.dto.RobotInstruction;
import com.assignment.rc_robots.model.Robot;
import com.assignment.rc_robots.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotController {

    @Autowired
    private RobotService robotService;

    @PostMapping("/navigate")
    public List<String> navigateRobots(@RequestBody NavigationInput input){
        List<String> results = new ArrayList<>();
        int maxX = input.getMaxX();
        int maxY = input.getMaxY();



        for(RobotInstruction instruction: input.getInstructions()){
            Robot robot = new Robot(instruction.getX(), instruction.getY(), instruction.getDirection());
            Robot result = robotService.instructionsToFollow(robot,instruction.getCommands(),maxX,maxY);
            results.add(result.toString());

        }


        return results;
    }
}
