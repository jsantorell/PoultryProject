/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poultry;

/**
 *
 * @author jerem
 */
public class PoultryReporter {

    private static int countDuck = 0;
    private static int countChicken = 0;

    public final static void setPoultryCount(Poultry p) {
        int count = 0;
        if (count == 0) {
            switch (p.getPoultryType()) {
                case DUCK:
                    countDuck++;
                    count++;
                    break;
                case CHICKEN:
                    countChicken++;
                    count++;
                    break;
                default:
                    break;

            }
        }
    }

    public final static String getPoultryCount() {

        return "You have " + countDuck + " Ducks and " + countChicken + " Chickens on your farm.";
    }

    public final static void Poultryinformation(Poultry p) {

        p.getPoultryClass();
        p.getType();
        p.performFly();
        p.performAudible();
        p.performSwim();
    }

}
