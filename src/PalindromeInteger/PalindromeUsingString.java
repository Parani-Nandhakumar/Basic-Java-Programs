package PalindromeInteger;

import java.util.Scanner;

public class PalindromeUsingString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the Palindrome : ");
        int numToCheck = scanner.nextInt();
        String numberToCheck = Integer.toString(numToCheck);
        System.out.println("Number to check : "+numberToCheck);
        int numLength = numberToCheck.length();
        String reversedNumber="";
        for(int i=numLength-1;i>=0;i--){
            reversedNumber = reversedNumber + numberToCheck.charAt(i);
        }
        System.out.println("Reversed Number : "+reversedNumber);
        if(numberToCheck.equalsIgnoreCase(reversedNumber)){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
