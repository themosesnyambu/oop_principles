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
public class BuilderPattern {
    public static void main(String [] args){
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();
        Robot firtRobot = robotEngineer.getRobot();
        System.out.println(firtRobot.getRobotHead());
    }
}
