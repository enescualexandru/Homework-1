/**
 * 1. Calculate the sum of the first 100 numbers higher than 0
 */
package sci.tema;

public class Sum {
    public Sum() {
        System.out.println("1. Calculate the sum of the first 100 numbers higher than 0:");
        short sum = 0;
        for (byte i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum of the first 100 numbers is: " + sum);
    }
}
