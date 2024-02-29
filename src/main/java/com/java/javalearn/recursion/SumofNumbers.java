package com.java.javalearn.recursion;

public class SumofNumbers {
    public static void main(String [] args){
System.out.println(sum(1232));
    }
     public static int sum(int n){
        if(n/10<1){
          return n;
        }
         return n%10 * sum(n/10);
    }
}
