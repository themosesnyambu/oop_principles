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
public interface RobotPlan {
    public void setRobotHead(String head);
    public void setRobotTorso(String torso);
    public void setRobotArms(String arms);
    public void setRobotLegs(String legs);

}
