package com.java.javalearn.strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "KINUTHIA";

        //APPROACH 1
        StringBuilder builder1 = new StringBuilder();
        str.chars().distinct().forEach(c -> builder1.append((char)(c)));
        System.out.println(builder1);
        System.out.println(" ");
        //APPROACH 2
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int dup = str.indexOf(ch,i+1);
            if (dup == -1){
                builder2.append(ch);
            }
        }
        System.out.println(builder2);
        System.out.println(" ");
        //APPROACH 3
        char [] arr = str.toCharArray();
        StringBuilder builder3 = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    repeated = true;
                    break;
                }

            }
            if(!repeated){
                builder3.append(arr[i]);
            }
        }
        System.out.println(builder3);
        System.out.println(" ");

        char[] sort = str.toCharArray();
        Arrays.sort(sort);
        System.out.println(sort);

    }

}
