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
public class Caveman {
    //Fields or Instance variables
    private String name;
    private int HP, x, y;
    private boolean cavemanHasKey;
    
    //Constructor
    public Caveman(String name, int x, int y) {
        this.HP = 100;
        this.cavemanHasKey = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Methods (how an interaction happens)
    public void speak() {
        System.out.println("BOnK I'm " + name);
    }
    
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    public void moveUp() {
        // this means that y is decreased by one (could have used other ways to decrease/increase as well)
        y -= 1;
        // Y tracks how far down (as opposed to how far up)
    }
    public void moveDown() {
        y += 1;
    }
    public void moveLeft() {
        x -= 1;
    }
    public void moveRight() {
        x += 1;
    }
    
    public void eat(Food food) {
        HP += food.getHealthBoost();
    }
    //Accessors - getters & setters
    public int getHP() {
        return HP;
    }
    
    //This makes sure that the HP is never set to anything above 100 for some odd reason
    public void setHP(int HP) {
        if (HP <= 100 && HP > 0) {
            this.HP = HP;
        }
        else {
            System.out.println("Don't eat too much, your HP is full");
            this.HP = 100;
        }
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isCavemanHasKey() {
        return cavemanHasKey;
    }
     
}
