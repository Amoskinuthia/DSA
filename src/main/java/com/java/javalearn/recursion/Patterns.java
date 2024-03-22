package com.java.javalearn.recursion;

public class Patterns {
    public static void main(String[] args){
        printTriangle(4,0);
    }
  public static void printTriangle(int r, int c){
        if(r==0){
            return;
        }

      while (r >= c) {
          c++;
            System.out.print("#");
        }
      System.out.println();
      printTriangle(r-1,c-1);
    }
}
