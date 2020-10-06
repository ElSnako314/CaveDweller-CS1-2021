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
public class Key {
    //Key's Fields/Instance variables
    private int x, y;
    
    public Key (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void keyGivesAClue() {
        System.out.println("You've found a key! A note appears on its side");
        System.out.println("The note reads: ");
        //System.out.println("The x coordinate of the door is at " + Cave.getDoor().getX() + " and the y coordinate of the door is at " + Cave.getDoor().getY());
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
