/**
 * 9. Input 2 values:  start  and  finish, then display the numbers from start to finish
 */
package sci.tema;

import java.util.Scanner;

public class DisplayNumbers {
    public DisplayNumbers() {
        System.out.println(" ");
        Scanner reader = new Scanner(System.in);
        System.out.println("9. Input 2 values:  start  and  finish, then display the numbers from start to finish");
        System.out.println("Enter start: ");
        int start = reader.nextInt();
        System.out.println("Enter finish: ");
        int finish = reader.nextInt();
        int min = start;
        int max = finish;
        if (start > finish) {
            min = finish;
            max = start;
        }
        System.out.println("The numbers between " + min + " and " + max + " are: ");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
