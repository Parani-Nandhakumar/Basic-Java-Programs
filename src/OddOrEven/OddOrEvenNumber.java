package OddOrEven;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the odd or even : ");
        int numberToCheck = scanner.nextInt();
        if(numberToCheck<0){
            System.out.println("Enter positive number to check");
        }
        else if(numberToCheck==1){
            System.out.println("Entered number is odd number");
        }
        else {
            if(numberToCheck%2==0){
                System.out.println("Entered number is even number");
            }
            else {
                System.out.println("Entered number is odd number");
            }
        }
    }
}
