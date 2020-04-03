package com.company.bitOperation;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number) {
        //assume the number is not negative
        return number > 0 && (number & (number - 1)) == 0;
        //time complexity O(1) and space complexity O(1)
    }

    public static void main(String[] args) {
        int test = 8;
        isPowerOfTwo(8);
    }
}
