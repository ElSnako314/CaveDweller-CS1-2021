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
    //Caveman's Fields/Instance variables
    private String name;
    private int HP, x, y;
    private boolean cavemanHasKey;
    
    //Caveman's Constructor
    public Caveman(String name, int x, int y) {
        this.HP = 100;
        this.cavemanHasKey = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Caveman's Methods (how an interaction happens)
    public void speak() {
        System.out.println("BOnK I'm " + name);
    }
    
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
        //Methods of Caveman's movement
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
        food.setIsFoodEaten(true);
        System.out.println("Me eat the " + food.getName() + "!!");
    }
    
    public void pickUpKey() {
        this.cavemanHasKey = true;
        
    }
    
    public void openDoor() {
        if (this.cavemanHasKey == true) {
            System.out.println("YOU'RE FREE!! Caveman escaped.");
            System.exit(0);
        }
        else {
            System.out.println("Hmm, it's locked. If only there was a key...");
        }
    }
    //Accessors - getters & setters
    public int getHP() {
        return setHP(HP);
    }
    
        //A setter that makes sure that the HP is never set to anything above 100 for some odd reason
        public int setHP(int HP) {
            if (HP <= 100 && HP > 0) {
                return this.HP = HP;
            }
            else {
                System.out.println("Don't eat too much, your HP is already full");
                return this.HP = 100;
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
        
        //A setter that can change the boolean isCavemanHasKey()
        public void setCavemanHasKey(boolean cavemanHasKey) {
            this.cavemanHasKey = cavemanHasKey;
        }
     
}
