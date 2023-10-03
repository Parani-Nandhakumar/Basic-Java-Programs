package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElementsInTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> inputElement = new ArrayList<>();
        ArrayList<Integer> duplicateElements = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total array elements:");
        int totalElementsSize = scanner.nextInt();
        for (int intialize = 1; intialize <= totalElementsSize; intialize++) {
            System.out.println("Enter array elements");
            inputElement.add(scanner.nextInt());
        }
        System.out.println(inputElement);
        for (int i = 0; i < totalElementsSize - 1; i++) {
            for (int j = i + 1; j < totalElementsSize; j++) {
                if (inputElement.get(i) == inputElement.get(j)) {
                    if (!duplicateElements.contains(inputElement.get(i))) {
                        duplicateElements.add(inputElement.get(i));
                    }
                }
            }
        }
        System.out.println(duplicateElements);
    }
}