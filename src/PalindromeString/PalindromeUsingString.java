package PalindromeString;

import java.util.Scanner;

public class PalindromeUsingString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check the Palindrome : ");
        String stringToCheck = scanner.nextLine();
        System.out.println("String to check : "+stringToCheck);
        int numLength = stringToCheck.length();
        String reversedString="";
        for(int i=numLength-1;i>=0;i--){
            reversedString = reversedString + stringToCheck.charAt(i);
        }
        System.out.println("Reversed String : "+reversedString);
        if(stringToCheck.equalsIgnoreCase(reversedString)){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
    }
}