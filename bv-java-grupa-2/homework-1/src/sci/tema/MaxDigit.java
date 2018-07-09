/**
 * 3. Display the max digit from a number. Read the number from keyboard
 */
package sci.tema;

import java.util.Scanner;

public class MaxDigit {

    public MaxDigit() {
        int number;
        int maxDigit;
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("3. Display the max digit from a number. Read the number from keyboard");
        System.out.print("Enter a number: ");
        number = reader.nextInt();
        maxDigit = number % 10;
        while (number > 0) {
            number = number / 10;
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
        }
        System.out.println("Max digit of the number is " + maxDigit);
    }
}
