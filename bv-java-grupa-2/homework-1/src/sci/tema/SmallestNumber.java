/**
 * 2. Display the smallest number from a collections of numbers
 */
package sci.tema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestNumber {
    public SmallestNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("2. Display the smallest number from a collections of numbers:");
        System.out.println("How many numbers to auto generate ? ");
        int numbersToGenerate = reader.nextInt();
        System.out.println("The auto generated numbers are: ");
        List<Integer> collection = new ArrayList<Integer>();
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbersToGenerate; i++) {
            collection.add(i, (int) (Math.random() * 1000));
            if(collection.get(i) < smallest) {
                smallest = collection.get(i);
            }

            if (i < numbersToGenerate-1) {
                System.out.print(collection.get(i) + ", ");
            } else {
                System.out.println(collection.get(i) +". The smallest number is: " + smallest);
            }
        }
    }
}