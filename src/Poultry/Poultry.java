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
public interface Poultry {

    public abstract void getPoultryClass();

    public abstract void performAudible();

    public abstract void performFly();

    public abstract void performSwim();

    public abstract void getType();

    public abstract void setPoultryType(PoultryType q);

    public abstract PoultryType getPoultryType();

}
