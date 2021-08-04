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
public interface RobotBuilder {
    public void buildRobotHead();
    public void buildRobotArms();
    public void buildRobotTorso();
    public void buildRobotLegs();

    public Robot getRobot();
}
