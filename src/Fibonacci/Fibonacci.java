package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to trigger fibonacci series : " );
        int number = scanner.nextInt();
        //initializing needed variables
        int a=0,b=1,sum;
        for(int i=0; i<=number; i++){
            //We first add a and b assign it to sum --> addition gives the fibonacci number
            //then assign a to b --> b needs to be assigned to a for next cycle
            //then assign sum to a --> sum needs to be assigned to a for next cycle
            sum=a+b;
            b=a;
            a=sum;
            System.out.println(a);
        }
    }
}