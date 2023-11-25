package com.java.javalearn;

import java.util.Arrays;

public class FirstLastPositionofTarget {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(findPositions(arr, 8)));
    }

    static int[] findPositions(int[] arr, int target) {
        int start = binarySearch(arr, target, true);
        int end = binarySearch(arr, target, false);

        return new int[]{start, end};
    }

    static int binarySearch(int[] arr, int target, boolean isFirst) {
        int result = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (isFirst)
                    high = mid - 1; // Continue search on the left side
                else
                    low = mid + 1; // Continue search on the right side
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return result;
    }
}
