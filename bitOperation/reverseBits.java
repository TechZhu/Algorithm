package com.company;

public class reverseBits {
    //reverse bits of a 32-bit integer
    //in Java, long takes 64 bits while in C++ it only takes 32 bits
    //no assumption needed
    public long reverseBits(long n) {
        for(int offset = 0; offset < 16; offset++) {
            long right = (n >>> offset) & 1L;
            long left = (n >>> (31 - offset)) & 1L; // here, not n << offset
            if(left != right) { // use xor to flip the bit
                n ^= 1L << offset;
                n ^= 1L << (31 - offset);
            }
        }
        return n;
    }
    //time complexity is O(1) and space complexity is O(1);
}
