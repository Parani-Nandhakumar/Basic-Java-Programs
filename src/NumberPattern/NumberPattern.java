package NumberPattern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lines : ");
        int lines= scanner.nextInt();
        for(int i=1;i<=lines;i++){
            for(int j=lines;j>=1;j--){
                if(j!=i)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}