package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the armstrong number : ");
        int armstrongNumber = scanner.nextInt();
        String armstrongNumberString = Integer.toString(armstrongNumber);
        int numberOfDigits = armstrongNumberString.length();
        for (int i=0; i<numberOfDigits;i++){
            char currentChar = armstrongNumberString.charAt(i);
            int currentDigit = Character.digit(currentChar,10);
            num = (int) (num + Math.pow(currentDigit,numberOfDigits));
        }
        System.out.println("Calculated value is : " + num);
        if(num==armstrongNumber) System.out.println("Number is Armstrong Number");
        else System.out.println("Number is not an Armstrong Number");
    }
}