package com.company.bitOperation;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number) {
        //assume the number is not negative
        if(number < 0) {
            return -1;
        }
        return number > 0 && (number & (number - 1)) == 0;
        //time complexity O(1) and space complexity O(1)
    }

    public static void main(String[] args) {
        isPowerOfTwo(-5);
        isPowerOfTwo(5);
        isPowerOfTwo(0);
    }
}
