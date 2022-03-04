package SwappingNumbers;

import java.util.Scanner;

public class SwapNumbersWithout3rdVariable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number A : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Number B : ");
        int b = scanner.nextInt();
        a=a+b; //Assuming A=20 and B=10, here A would get assigned 30
        b=a-b; //Here B would get assigned 30-10=20
        a=a-b; //Here A would get assigned 30-20=10
        //So numbers are swapped by above allocation
        System.out.println("Swapped numbers : "+"A="+a+" B="+b);
    }
}