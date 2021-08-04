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
public class Robot implements RobotPlan{
    private String robotHead;
    private String robotArms;
    private String robotTorso;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotLegs() {
        return robotLegs;
    }
    
    
    
}
