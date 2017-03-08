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
public abstract class CustomPoultry implements Poultry {

    private Audible audible;
    private Flyable flyable;
    private Swimable swimable;
    private String species;

    PoultryType poultryType;

    public CustomPoultry(Audible audible, Flyable flyable, Swimable swimable, PoultryType p, String type) {
        this.audible = audible;
        this.flyable = flyable;
        this.swimable = swimable;
        this.species = type;
        this.poultryType = p;
    }

    public final Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }

    @Override
    public final void performAudible() {
        audible.makeSound();
    }

    @Override
    public final void performFly() {
        flyable.fly();
    }

    public final Audible getAudible() {
        return audible;
    }

    public void setAudible(Audible audible) {
        this.audible = audible;
    }

    public final Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public final void getType() {
        System.out.println(species);
    }

    public void setType(String type) {
        this.species = type;
    }

    @Override
    public final void getPoultryClass() {
        System.out.println(poultryType);
    }

    @Override
    public final void performSwim() {
        swimable.swim();
    }

    @Override
    public void setPoultryType(PoultryType q) {

        this.poultryType = q;

    }

    ;

    @Override
    public final PoultryType getPoultryType() {

        return poultryType;
    }
;

}
