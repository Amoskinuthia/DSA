package com.java.javalearn;
import java.util.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 1, 2, 5};

        // Sort the array
        Arrays.sort(arrayWithDuplicates);

        int length = arrayWithDuplicates.length;

        // Iterate through the sorted array to find and remove duplicates
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arrayWithDuplicates[i] != arrayWithDuplicates[i + 1]) {
                arrayWithDuplicates[j++] = arrayWithDuplicates[i];
            }
        }

        // Add the last element
        arrayWithDuplicates[j++] = arrayWithDuplicates[length - 1];

        // Create a new array without duplicates (if needed)
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, j);

        // Print the array without duplicates
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
}
