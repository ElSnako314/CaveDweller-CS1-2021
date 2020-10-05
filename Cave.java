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

    /*Defines all of the variables, preceded by their class (variable type; capitalized)
      Also sets all of the variables to "private"
    */
    private double temperature;
    private int sizeOfCave;
    private Bat bat1; 
    private Caveman caveman;
    private Key key;
    private Food food1;
    private Door door;
    
    public Cave() {
        this.temperature = Math.random() * 100;
        this.sizeOfCave = 10 + (int) (11 * Math.random());
        //Instantiating variables (making the object)
        this.caveman = new Caveman("Harvey", (int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made caveman  
            System.out.println("You are at " + caveman.toString());
        this.food1 = new Food("apple", (int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made food
            System.out.println("An " + food1.getName() + " appears at x: " + this.food1.getX() + " y: " + this.food1.getY());
        this.bat1 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat1.getX() + " y: " + this.bat1.getY());
        
    }
    
    //A method that checks collisions between different objects
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
            System.out.println("You've eaten an " + food1.getName() + " and your health has increased to " + caveman.getHP());
        }
        if (caveman.getX() == bat1.getX() && caveman.getY() == bat1.getY()) {
            bat1.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
    }
    
    //A method that handles the directional inputs of the user
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
    /*  Actually telling the program to check collisions (after the inputs, of course)
        Note that this is within the method of "handleInput"
    */    
    checkCollisions();
    }
    
    //A simple toString method that returns the size of a cave
    public String toString() {
        return "" + sizeOfCave;
    }
    
}
