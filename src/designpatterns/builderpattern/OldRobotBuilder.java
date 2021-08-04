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
public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("tin");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("blow torch");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("tin");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("roller skates");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
    
}
