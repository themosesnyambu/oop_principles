/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.builderpattern;

/**
 *
 * @author admin
 */
public class RobotEngineer {
    private RobotBuilder robotBuilder;
    
    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }
    
    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
    
    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotTorso();
    }
}
