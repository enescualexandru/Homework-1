/**
 * 6. Input the dimensions of a rectangle and display area and perimeter
 */
package sci.tema;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle() {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("6. Input the dimensions of a rectangle and display area and perimeter");
        System.out.println("Enter width: ");
        this.width = reader.nextInt();
        System.out.println("Enter length: ");
        this.length = reader.nextInt();
        System.out.println("Area is " + (this.width * this.length) + " and perimeter is " + (2 * this.length + 2 * this.width));
    }

}
