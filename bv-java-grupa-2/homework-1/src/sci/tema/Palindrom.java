/**
 * 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
 */
package sci.tema;

import java.util.Scanner;

public class Palindrom {
    public Palindrom() {
        int number;
        int copyNumber;
        int inverted = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("4. Check if a number is palindrom( e.g palindrom 1221, 34143)");
        System.out.print("Enter a number: ");
        number = reader.nextInt();
        copyNumber = number;
        while (number != 0) {
            inverted = inverted * 10 + (number % 10);
            number = number / 10;
        }
        if (inverted == copyNumber) {
            System.out.println("The number IS palindrom");
        } else {
            System.out.println("The number is NOT palindrom");
        }

    }
}
