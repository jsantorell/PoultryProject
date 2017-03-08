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
public class StartUp {
    
    public static void main(String[] args) {
        
        //Grab an already made one
        IndianRunnerDuck.addADuck();
        System.out.println();
        System.out.println();
        
        
        //Grab an already made one
        BuffOrphingtonChicken.addAChicken();
        System.out.println();
        System.out.println();
        
        //Make your Own
        Audible quack = new Quack();
        Flyable fly = new FlyWithWings();
        Swimable swim = new SwimWithFeet();
        PickYourOwnPoultry.poultryInformation(quack, fly, swim, PoultryType.DUCK, "Peking");
        PickYourOwnPoultry.addACustomPoultry();
        System.out.println();
        System.out.println();
        
        
        //Display how many of each poultry type you have at your farm.
        System.out.println(PoultryReporter.getPoultryCount());
        
        
        
        
        
    }
    
    
    
}
