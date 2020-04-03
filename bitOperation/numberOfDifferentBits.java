package com.company;

public class numberOfDifferentBits {
    public int diffBits(int a, int b) {
        //no edge case need to be considered
        //could use a bitwise xor operation
        int ct = 0;
        for(int i = a ^ b; i > 0; i >>>= 1) {
            ct += i & 1;
        }
        return ct;
        //time complexity is O(numOfBits), space complexity is O(1)
    }
}
