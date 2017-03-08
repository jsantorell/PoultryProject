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
public class PickYourOwnPoultry {
    
        private static Poultry poultry;
    
        public static CustomPoultry poultryInformation(Audible a, Flyable f, Swimable s, PoultryType p, String species) {
        Audible quack = a;
        Flyable fly = f;
        Swimable swim = s;
        
        
        poultry = new CustomPoultry(quack, fly, swim, p, species) {};
        return (CustomPoultry) poultry;
    }

    public static final void addACustomPoultry() {
        // TODO code application logic here

        PoultryReporter.setPoultryCount(getPoultry());
        PoultryReporter.Poultryinformation(getPoultry());
        
    }
        public void getTypeOfPoultry() {

        getPoultry().getType();
    }

    public final static Poultry getPoultry() {
        return poultry;
    }

    public static void setPoultry(Poultry poultry) {
        PickYourOwnPoultry.poultry = poultry;
    }
        
        
    
}