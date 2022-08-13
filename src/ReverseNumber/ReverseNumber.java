package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int numberToReverse = scanner.nextInt(); //number to be reversed is stored in to a variable
        int bufferNumber, reversedNumber = 0; //bufferNumber variable to calculate the remainder and store & reversedNumber variable to store the reversed number
        if (numberToReverse < 0) {
            System.out.println("Enter positive integer to check");
        } else {
            while (numberToReverse > 0) { //number to be reversed checked to be greater than zero always
                bufferNumber = numberToReverse % 10; //remainder calculation using modulo
                reversedNumber = reversedNumber * 10 + bufferNumber; //reversed number gets calculated using addition of buffer number with reversedNumber multiplied by 10 every iteration
                numberToReverse = numberToReverse / 10; //number to be reversed updated using division
            }
            System.out.println("Reversed Number is : " + reversedNumber);
        }
    }
}
