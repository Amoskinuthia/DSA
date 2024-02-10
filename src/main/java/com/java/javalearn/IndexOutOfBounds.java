package com.java.javalearn;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArrayElements(array);
    }

    static void printArrayElements(int[] arr) {
        int n = arr.length;

        // Using i <= n - 1 may lead to an "Index Out of Bounds" error
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
