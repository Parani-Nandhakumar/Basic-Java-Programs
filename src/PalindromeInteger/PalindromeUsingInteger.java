package PalindromeInteger;

import java.util.Scanner;

public class PalindromeUsingInteger {
    public static void main(String[] args){
        //Entering the number to be checked
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the Palindrome : ");
        int numberToBeChecked = scanner.nextInt();
        System.out.println("Entered number is : "+numberToBeChecked);
        int a=0,b,c=numberToBeChecked,reversedNumber=0;
        while(c>0){
            //b would store the reminder typically the last digit
            b=c%10;
            //a would store the digits from reverse like in number 4321, it stores 1,12,123,1234 for every loop
            a=(a*10)+b;
            //c would store digits from start like in number 4321, it stores 432, 43, 4, 0. with 0 loop exits
            c=c/10;
            //a is stored in as reversed number
            reversedNumber=a;
        }
        System.out.println("Reverse of the entered number is : "+reversedNumber);
        //check if reversed number is same as entered number
        if(reversedNumber==numberToBeChecked){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}