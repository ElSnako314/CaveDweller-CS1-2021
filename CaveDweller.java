
package cavedweller;

import java.util.Scanner;

/**
 *
 * @author ElSnako
 */
public class CaveDweller {

    public static void main(String[] args) {
        Cave cave = new Cave();
        System.out.println(cave.toString());
        
        Scanner keyBoard = new Scanner(System.in);
        
        //Making this repeat (a loop)
        String input = "";
        while (!input.equals("close")) {
            input = keyBoard.nextLine();
            cave.handleInput(input);
        }
    }
}
