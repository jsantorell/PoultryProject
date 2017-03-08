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
public class IndianRunnerDuck {

    public static CustomPoultry duckInformation() {
        Audible quack = new Quack();
        Flyable fly = new FlyWithWings();
        Swimable swim = new SwimWithFeet();
        Poultry duck = new CustomPoultry(quack, fly, swim, Poultry.PoultryType.DUCK, "Indian Runner") {
        };
        return (CustomPoultry) duck;
    }

    public static void addADuck() {
        // TODO code application logic here

        PoultryReporter.setPoultryCount(duckInformation());
        PoultryReporter.Poultryinformation(duckInformation());

    }

    public void getTypeOfPoultry() {

        duckInformation().getType();
    }

}
