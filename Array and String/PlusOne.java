class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean olim = false;
        for(int i=digits.length-1;i>=0;i--) {
            int tmp = digits[i]+1;
            if(tmp>=10) {
                olim = true;
            } else {
                olim = false;
            }
            digits[i] = tmp%10;
            if(!olim) {
                return digits;
            }
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}