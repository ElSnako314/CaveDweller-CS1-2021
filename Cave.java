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
public class Cave {
    private double temperature;
    private int sizeOfCave;
    private Bat bat; 
    private Caveman caveman;
    private Key key;
    private Food food1;
    private Door door;
    
    public Cave() {
        this.temperature = Math.random() * 100;
        this.sizeOfCave = 10 + (int) (11 * Math.random());
        //instantiate (making the object)
        this.caveman = new Caveman("Harvey", (int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
        this.food1 = new Food("apple", (int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
        System.out.println("You are at " + caveman.toString());
        System.out.println("An " + food1.getName() + " appears at x: " + this.food1.getX() + " y: " + this.food1.getY());
    }
    
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
            System.out.println("You've eaten an " + food1.getName() + " and your health has increased to " + caveman.getHP());
        }
    }
            
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            this.caveman.moveUp();
            System.out.println("You're now at " + this.caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            this.caveman.moveDown();
            System.out.println("You're now at " + this.caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            this.caveman.moveLeft();
            System.out.println("You're now at " + this.caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            this.caveman.moveRight();
            System.out.println("You're now at " + this.caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("Sorry, I don't understand");
            System.out.println("Please use the words: up, down, left, and right");
        }
        checkCollisions();
    }
    public String toString() {
        return "" + sizeOfCave;
    }
    
}
