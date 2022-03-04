package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check prime number : ");
        int numberToBeChecked = scanner.nextInt();
        //prime number is a number which can only be divisible by it's own number
        //Logic to be used is to check whether the number is divisible by 2 or 3
        if(numberToBeChecked==0||numberToBeChecked==1||numberToBeChecked<0){
            System.out.println("Enter proper number to check");
        }
        else{
            if(numberToBeChecked%2==0){
                System.out.println("Entered number is not a prime number");
            }
            else if(numberToBeChecked%3==0){
                System.out.println("Entered number is not a prime number");
            }
            else{
                System.out.println("Enetered number is a prime number");
            }
        }
    }
}