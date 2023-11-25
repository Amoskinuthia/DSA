 package com.java.javalearn;

class Arrays {
    public static void main(String[] args) {
        int [] nums = {2,3,5,8,19};
        int min = nums[0];
        int max = nums[0];
        for (int i=1 ;i<nums.length;i++){
            if (min>nums[i]){
                min = nums[i];
            }
            if (max<nums[i]){
                max = nums[i];
            }
            if(i%2 == 0){
                System.out.println(nums[i]);
            }
        }
        System.out.print("The m in value is: ");
        System.out.println(min);
        System.out.print("The max value is: ");
        System.out.println(max);
       int result = linearSearch(nums,5);
            System.out.print("Target found" + result);


    }
    static int linearSearch(int[]arr,int target){
        for (int i = 0;i< arr.length;i++){
            int current = arr[i];
            if(current==target){
                return i;
            }
        }
        return -1;
    }

    static void manipulate() {
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterating through the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Iterating through the array using an enhanced for loop (for-each)
        for (int num : numbers) {
            System.out.println(num);
        }
    }

   static void man() {
        int[] numbers = {1, 2, 3, 4, 5};

        // Changing the value of an array element
        numbers[2] = 10;

        // Printing the modified array
        for (int num : numbers) {
            System.out.println(num);
        }
    }



}