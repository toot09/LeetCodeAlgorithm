// 66. Plus One
// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/problems/plus-one/


class PlusOneGoogle {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1 ; i>=0 ; i--) {
            digits[i]++;
            if(digits[i]<10) return digits;
            digits[i] %= 10;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}