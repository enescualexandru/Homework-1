/**
 * 5. Display all the prime numbers lower than a given number
 */
package sci.tema;

import java.util.Scanner;

public class Prime {
    public Prime() {
        int number;
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("5. Display all the prime numbers lower than a given number");
        System.out.print("Enter a positive number: ");
        number = reader.nextInt();

        System.out.print("Prime numbers until " + number + ": ");
        for (int i = 1; i <= number; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}
