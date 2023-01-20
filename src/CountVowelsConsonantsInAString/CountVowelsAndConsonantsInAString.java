//This program counts vowels and consonants in a string
//logic used is to check vowel characters first, if found then increment variable
//Else character is checked whether it's a number or white space, if yes increment corresponding variable or else increment the consonant variable

package CountVowelsConsonantsInAString;

import java.util.Scanner;

public class CountVowelsAndConsonantsInAString {
    public static void main(String[] args){
        int vowelCount = 0;
        int consonantCount = 0;
        int numCount = 0;
        int whiteSpaceCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be checked : ");
        String stringToCheck = scanner.nextLine();
        String lcStringToCheck = stringToCheck.toLowerCase();
        int lengthStringToCheck = stringToCheck.length();
        for(int i=0;i<lengthStringToCheck;i++){
            if(lcStringToCheck.charAt(i) == 'a' || lcStringToCheck.charAt(i) == 'e' || lcStringToCheck.charAt(i) == 'i' || lcStringToCheck.charAt(i) == 'o' || lcStringToCheck.charAt(i) == 'u'){
                vowelCount++;
            }
            else{
                if(lcStringToCheck.charAt(i) == '1' || lcStringToCheck.charAt(i) == '2' || lcStringToCheck.charAt(i) == '3' || lcStringToCheck.charAt(i) == '4' || lcStringToCheck.charAt(i) == '5' || lcStringToCheck.charAt(i) == '6' || lcStringToCheck.charAt(i) == '7' || lcStringToCheck.charAt(i) == '8' || lcStringToCheck.charAt(i) == '9' || lcStringToCheck.charAt(i) == '0'){
                    numCount++;
                }
                else if(lcStringToCheck.charAt(i) == ' '){
                    whiteSpaceCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel count = " +vowelCount+ " & Consonant count = " +consonantCount+ " & num count = "+numCount+ " & whiteSpace count = "+whiteSpaceCount);
    }
}