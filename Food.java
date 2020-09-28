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
public class Food {
    //Fields
    private String foodType, name;
    private int healthBoost, x, y;
    private boolean isFoodEaten, isFoodRotten;
    //Constructor
    public Food(String name, int x, int y) {
        this.healthBoost = 20;
        this.isFoodEaten = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Method
    public void foodName() {
        name = "apple";
        System.out.println(name);
    }
    
    public String toString() {
        return "An " +name+ " appears at" + "x: "+x+", y: "+y;
    }
    
    //Accessors
    public String getName() {
        return name;
    }

    public int getHealthBoost() {
        return healthBoost;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isIsFoodEaten() {
        return isFoodEaten;
    }
    
}
