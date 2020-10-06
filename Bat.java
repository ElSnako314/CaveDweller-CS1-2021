/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author ElSnako
 */
public class Bat {
    //Bat's Fields/Instance variables
    private boolean isBatDefeated;
    private int x, y, batDamage, batHP;
    
    //Bat's Constructor
    public Bat(int x, int y) {
        this.batDamage = -5;
        this.batHP = 10;
        this.isBatDefeated = false;
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "The bat is at x: " + x + ", y: " + y;
    }
    public void moveAround() {
        //increase/decrease x by random number
        this.x += ((-1)^((int) (2 * Math.random()))) * ((int) (3 * Math.random()));
        //increase/decrease y by random number
        this.y += ((-1)^((int) (2 * Math.random()))) * ((int) (3 * Math.random()));
    }
    
    public void bite(Caveman caveman) {
        //reduce HP of the caveman
        int newHP = caveman.getHP() + batDamage;
        caveman.setHP(newHP);
        System.out.println("Youch! I've been bit by bat!");
    }

    //Methods
    
    //Accessors

    public boolean isIsBatDefeated() {
        return isBatDefeated;
    }

    public void setIsBatDefeated(boolean isBatDefeated) {
        this.isBatDefeated = isBatDefeated;
    }

    public int getX() {
        return x;
    }
    
    public int setX(int x) {
        //Cave size is just 15 because I don't know how to call the actual cave size
        if (x >= 0 && x <= 15) {
            return this.x = x;
        }
        else if (x < 0) {
            return this.x = 0;
        }
        else if (x > 15) {
            return this.x = 15;
        }
        else
            System.out.println("Sir...what even???");
            return 0;
    }
    
    public int getY() {
        return setY(y);
    }

    public int setY(int y) {
        //Cave size is just 15 because I don't know how to call the actual cave size
        if (y >= 0 && y <= 15) {
            return this.y = y;
        }
        else if (y < 0) {
            return this.y = 0;
        }
        else if (y > 15) {
            return this.y = 15;
        }
        else
            System.out.println("Sir...what even???");
            return 0;
    }

    public int getBatDamage() {
        return batDamage;
    }

    public void setBatDamage(int batDamage) {
        this.batDamage = batDamage;
    }
    
}
