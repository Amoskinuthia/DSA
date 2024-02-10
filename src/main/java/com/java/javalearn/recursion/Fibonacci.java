package com.java.javalearn.recursion;

public class Fibonacci {
    public static void main(String[] args){
        int answer = fib(3);
        System.out.println(answer);
    }
    static int fib(int n){
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
