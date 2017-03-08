/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poultry.GenericCopyPastePoultry;

import Poultry.GlobalVariables.PoultryType;
import Poultry.Swimable.*;
import Poultry.Flyable.*;
import Poultry.Audible.*;
import Poultry.CustomPoultry;
import Poultry.Poultry;
import Poultry.PoultryReporter;

/**
 *
 * @author jerem
 */
public class BuffOrphingtonChicken {

    public static final CustomPoultry chickenInformation() {
        Audible quack = new Boach();
        Flyable fly = new FlyWithWings();
        Swimable swim = new CanNotSwim();
        Poultry chicken = new CustomPoultry(quack, fly, swim, PoultryType.CHICKEN, "Buff Orphington") {
        };
        return (CustomPoultry) chicken;
    }

    public static final void addAChicken() {
        PoultryReporter.setPoultryCount(chickenInformation());
        PoultryReporter.Poultryinformation(chickenInformation());
    }

}
