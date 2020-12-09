// Difficulty : Medium
// Comment : ??? too Easy
// Runtime : 0ms(100%)
class ArithmeticSlices_category {
    public int numberOfArithmeticSlices(int[] A) {
        int[] count = new int[A.length];
        int ret = 0;
        for(int i=2 ; i<A.length ; i++) {
            if( (A[i]-A[i-1]) == (A[i-1]-A[i-2]) ) count[i] = count[i-1]+1;
            ret += count[i];
        }
        return ret;
    }
}