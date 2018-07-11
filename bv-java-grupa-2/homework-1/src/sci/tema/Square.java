/**
 * 7. Input the length of the side of a square, and display its area.
 * Produce an error message if the length is negative
 */
package sci.tema;

import java.util.Scanner;

public class Square {
    int side;

    public Square() {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("7. Input the length of the side of a square, and display its area.");
        System.out.print("Enter side size: ");
        this.side = reader.nextInt();
        if (this.side > 0) {
            System.out.println("Area is: " + this.side * this.side);
        } else {
            System.out.println("Lengh cannot be zero or negative !");
        }
    }

}
