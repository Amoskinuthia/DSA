package com.java.javalearn;

public class StringTransformationSaf {

    public static String solution(String input) {
        StringBuilder result = new StringBuilder(input);

        boolean transformed;
        do {
            transformed = false;
            int index = 0;

            while (index < result.length() - 1) {
                char current = result.charAt(index);
                char next = result.charAt(index + 1);

                if (Math.abs(current - next) == 1) {
                    // Remove the adjacent characters
                    result.delete(index, index + 2);
                    transformed = true;
                } else {
                    index++;
                }
            }
        } while (transformed);

        return result.toString();
    }

    public static void main(String[] args) {
        String example1 = solution("CBACD");
        String example2 = solution("CABABD");
        String example3 = solution("ACBDACBD");

        System.out.println("Transformed String 1: " + example1); // Output: C
        System.out.println("Transformed String 2: " + example2); // Output: ""
        System.out.println("Transformed String 3: " + example3); // Output: ACBDACBD
    }
}

