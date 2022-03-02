package PalindromeInteger;

import java.util.Scanner;

public class PalindromeUsingStringBuilder {
    public static void main(String[] args){
        //Entering the number to be checked
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the Palindrome : ");
        int numToCheck = scanner.nextInt();
        String numberToCheck = Integer.toString(numToCheck);
        System.out.println("Number to check : "+numberToCheck);
        int numLength = numberToCheck.length();
        StringBuilder reversedNumber = new StringBuilder();
        for(int i=numLength-1;i>=0;i--){
            reversedNumber.append(numberToCheck.charAt(i));
        }
        System.out.println("Reversed Number : "+reversedNumber);
        if(numberToCheck.equalsIgnoreCase(reversedNumber.toString())){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}