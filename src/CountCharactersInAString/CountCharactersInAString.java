package CountCharactersInAString;

import java.util.Scanner;

public class CountCharactersInAString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to count the characters :");
        String stringToCount = scanner.nextLine();
        int count=0;
        for(int i=0;i<stringToCount.length();i++){
            if(stringToCount.charAt(i) != ' '){
                count = count + 1;
            }
        }
        System.out.println("Total characters in this string is : "+count);
    }
}