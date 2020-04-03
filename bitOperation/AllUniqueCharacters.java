package com.company;
//Determine if the characters of a given string are all unique
public class AllUniqueCharacters {
    public static boolean allUnique(String word) {
        //assume we using charset ASCII
        //assume the input string is not null
        if(word.length() == 0) {
            return true;
        }
        int[] bitmap = new int[8];
        //each int takes 32 bits in Java
        char[] array = word.toCharArray();
        for(char letter : array) {
            int row = letter / 32;
            int col = letter % 32;
            if(((bitmap[row] >>> col) & 1) == 1) { // use >>> since it will not keep the previous bit
                return false;
            }
            bitmap[row] |= 1 << col;
        }
        //time complexity O(n) and space complexity is O(1)
        return true;
    }

    public static void main(String[] args) {
        allUnique("");
        allUnique("abbc");
    }
}
