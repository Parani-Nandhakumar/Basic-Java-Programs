package AddTwoMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args){
        System.out.println("Enter the total rows and columns in Matrix A: ");
        Scanner scanner = new Scanner(System.in);
        int aRow = scanner.nextInt();
        int aColumn = scanner.nextInt();
        int[][] aArray = new int[aRow][aColumn];
        System.out.println("Enter the elements for Matrix A");
        for(int i=0;i<aRow;i++){
            for(int j=0;j<aColumn;j++){
                aArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered A Matrix elements are : " + Arrays.deepToString(aArray));
        System.out.println("Enter the total rows and columns in Matrix B");
        int bRow = scanner.nextInt();
        int bColumn = scanner.nextInt();
        int[][] bArray = new int[bRow][bColumn];
        System.out.println("Enter the elements for Matrix B");
        for(int i=0;i<bRow;i++){
            for(int j=0;j<bColumn;j++){
                bArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered A Matrix elements are : " + Arrays.deepToString(bArray));
        int[][] cArray = new int[aRow][aColumn];
        for(int i=0;i<aRow;i++){
            for(int j=0;j<aColumn;j++){
                cArray[i][j] = aArray[i][j] + bArray[i][j];
            }
        }
        System.out.println("Addition of matrices : " + Arrays.deepToString(cArray));
    }
}