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
public class Quack implements Audible{
    @Override
    public void makeSound(){
        System.out.print("The sound I make is: ");
        System.out.println("Quack Quack Quack Quack");
    
    }
    
}
