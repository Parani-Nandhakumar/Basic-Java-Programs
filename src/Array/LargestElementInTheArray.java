package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElementInTheArray {
    public static void main(String[] args){
        ArrayList<Integer> inputElement = new ArrayList<>();
        int largestElement = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements size:");
        int elementSize = scanner.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<elementSize;i++){
            inputElement.add(scanner.nextInt());
        }
        for(int x=0;x<inputElement.size()-1;x++){
                if(inputElement.get(x)<inputElement.get(x+1)){
                    largestElement = inputElement.get(x+1);
            }
        }
        System.out.println("Largest element is : "+ largestElement);
    }
}
