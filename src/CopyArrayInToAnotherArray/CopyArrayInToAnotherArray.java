package CopyArrayInToAnotherArray;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayInToAnotherArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int arrayLength = scanner.nextInt();
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            array1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        for(int j=0;j<arrayLength;j++){
            array2[j] = array1[j];
        }
        System.out.println(Arrays.toString(array2));
    }
}