//Runtime: 0 ms (100%)
//Memory Usage: 38 MB (52.33%)
class PlusOne_TIQ {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1 ; i>=0 ; i--) {
            int num = digits[i]+1;
            digits[i] = num%10;
            if(num<=9) {
                return digits;
            }
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}