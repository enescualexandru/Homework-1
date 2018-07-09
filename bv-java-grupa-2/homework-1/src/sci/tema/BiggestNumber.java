/**
 * 8. Input 4 numbers, and display the biggest.
 */
package sci.tema;

import java.util.Scanner;

public class BiggestNumber {
    public BiggestNumber() {

        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("8. Input 4 numbers, and display the biggest.");
        System.out.println("Enter number 1: ");
        int n1 = reader.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = reader.nextInt();
        System.out.println("Enter number 3: ");
        int n3 = reader.nextInt();
        System.out.println("Enter number 4: ");
        int n4 = reader.nextInt();
        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("The biggest number is " + n1);
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("The biggest number is " + n2);
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println("The biggest number is " + n3);
        } else {
            System.out.println("The biggest number is " + n4);
        }
    }
}
