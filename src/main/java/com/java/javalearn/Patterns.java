package com.java.javalearn;

public class Patterns {
    public static void main(String[] args) {
pattern2(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int r = 0; r <= n ; r++){
            for(int c = 0; c < n - r; c++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
