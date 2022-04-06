package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int factorial=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int numberToCheck = scanner.nextInt();
        if(numberToCheck<0){
            System.out.println("Factorial can't be defined for a negative integer");
        }
        else if(numberToCheck==0){
            System.out.println("Factorial of number " +numberToCheck+ " is 1");
        }
        else{
            for(int i=numberToCheck; i>0; i--){
                factorial = factorial*i;
            }
            System.out.println("Factorial of the number "+numberToCheck+" is : "+factorial);
        }
    }
}