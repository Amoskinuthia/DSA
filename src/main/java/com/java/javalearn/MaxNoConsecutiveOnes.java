package com.java.javalearn;

public class MaxNoConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,1,1,0,1,1,1,1,1};
        System.out.println(consecutive(arr));
    }
    static int consecutive(int [] arr){

        int tempOnes = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                tempOnes++;
                maxOnes = Math.max(tempOnes,maxOnes);
            }else {
                tempOnes = 0;
            }
        }
        return maxOnes;
    }
}
