/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionAPI;

/**
 *
 * @author admin
 */
public class UFOEnemyShip {

    private String idcode = "100";

    private String getPrivate() {
        return "How did you get this";
    }

    private String getOtherPrivate(int thisInt, String thatString) {
        return "how did you get here" + thisInt + " " + thatString;
    }

    public UFOEnemyShip(int number, String randString) {
        System.out.println("You sent: " + number + " " + randString);
    }
}
