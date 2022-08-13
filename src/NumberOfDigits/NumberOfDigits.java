package NumberOfDigits;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the digits: ");
        int numberToCheck = scanner.nextInt();
        int numberOfDigits = 0;
        if (numberToCheck < 0) {
            System.out.println("Enter positive integer to check");
        } else {
            do {
                numberOfDigits = numberOfDigits + 1; //gets incremented each time in the loop
                numberToCheck = numberToCheck / 10;
            } while (numberToCheck > 0);
            System.out.println("Entered number is a " + numberOfDigits + " digit number");
        }
    }
}