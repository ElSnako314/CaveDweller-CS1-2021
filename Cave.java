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
    private Bat bat1, bat2, bat3, bat4, bat5; 
    private Caveman caveman;
    private Key key;
    private Food food1, food2;
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
        this.food2 = new Food("apple", (int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made food
            System.out.println("An " + food2.getName() + " appears at x: " + this.food2.getX() + " y: " + this.food2.getY());
        this.bat1 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat1.getX() + " y: " + this.bat1.getY());
        this.bat2 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat2.getX() + " y: " + this.bat2.getY());
        this.bat3 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat3.getX() + " y: " + this.bat3.getY());
        this.bat4 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat4.getX() + " y: " + this.bat4.getY());
        this.bat5 = new Bat((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the location of the newly made bat
            System.out.println("A bat appears at x: " + this.bat5.getX() + " y: " + this.bat5.getY());
        this.key = new Key ((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Tells you too look for the key, which can unlock the door
            System.out.println("A shiny object appears at x: " + this.key.getX() + " y: " + this.key.getY());
        this.door = new Door((int) (this.sizeOfCave * Math.random()), (int) (this.sizeOfCave * Math.random()));
            //Gives you the command to complete the game
            System.out.println("Find the way out!");
        
    }
    
    //A method that checks collisions between different objects
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
            System.out.println("You've eaten an " + food1.getName() + " and your health has increased to " + caveman.getHP());
        }
        if (caveman.getX() == food2.getX() && caveman.getY() == food2.getY()) {
            caveman.eat(food1);
            System.out.println("You've eaten an " + food1.getName() + "and your health has increased to " + caveman.getHP());
        }
        if (caveman.getX() == bat1.getX() && caveman.getY() == bat1.getY()) {
            bat1.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
        if (caveman.getX() == bat2.getX() && caveman.getY() == bat2.getY()) {
            bat2.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
        if (caveman.getX() == bat3.getX() && caveman.getY() == bat3.getY()) {
            bat3.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
        if (caveman.getX() == bat4.getX() && caveman.getY() == bat4.getY()) {
            bat4.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
        if (caveman.getX() == bat5.getX() && caveman.getY() == bat5.getY()) {
            bat5.bite(caveman);
            System.out.println("My health has decreased to " + caveman.getHP());
        }
        if (caveman.getX() == key.getX() && caveman.getY() == key.getY()) {
            caveman.pickUpKey();
        }
        if (caveman.getX() == door.getX() && caveman.getY() == key.getY()) {
            caveman.openDoor();
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
    makeBatsMove();
    }
    
    private void makeBatsMove() {
        bat1.moveAround();
        bat2.moveAround();
        bat3.moveAround();
        bat4.moveAround();
        bat5.moveAround();
        System.out.println(bat1.toString());
        System.out.println(bat2.toString());
        System.out.println(bat3.toString());
        System.out.println(bat4.toString());
        System.out.println(bat5.toString());
    }
    //A simple toString method that returns the size of a cave
    public String toString() {
        return "" + sizeOfCave;
    }

    //Getters for bats (in the while loop at CaveDweller)
    public Bat getBat1() {
        return bat1;
    }

    public Bat getBat2() {
        return bat2;
    }

    public Bat getBat3() {
        return bat3;
    }

    public Bat getBat4() {
        return bat4;
    }

    public Bat getBat5() {
        return bat5;
    }
    //Getter for the door (for the keyGivesAClue method)
    public Door getDoor() {
        return door;
    }
    
    
}
