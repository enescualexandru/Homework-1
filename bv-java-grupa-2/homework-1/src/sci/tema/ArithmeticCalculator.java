/**
 * 10. Implement an arithmetic calculator
 */
package sci.tema;

import java.util.Scanner;

public class ArithmeticCalculator {
    public ArithmeticCalculator() {
        Scanner reader = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("10. A very basic arithmetic calculator");
        System.out.println("Enter your desired operation: \n"
                + "1 -> addition \n"
                + "2 -> subtraction \n"
                + "3 -> multiplication \n"
                + "4 -> division \n");
        short option = reader.nextShort();
        System.out.println("Enter first number: ");
        double a = reader.nextDouble();
        System.out.println("Enter second number: ");
        double b = reader.nextDouble();
        double result = 0;
        switch (option) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
        }
        System.out.println("The result is :" + result);
    }
}
