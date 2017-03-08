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
public class CanNotSwim implements Swimable{

    @Override
    public final void swim() {
        System.out.println("I can not Swim");
    }
    
}
