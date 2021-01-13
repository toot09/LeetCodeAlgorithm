// Difficulty : Medium
// Comment : Kick is [swap[i] = swap[i-1]+1;] sequence swap and swap is equal none!
// url : https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing/
class MinimumSwapsToMakeSequencesIncreasing_category {
    public int minSwap(int[] A, int[] B) {
        int len = A.length;
        int[] swap = new int[len];
        int[] none = new int[len];
        swap[0] = 1;
        for(int i=1 ; i<len ; i++) {
            swap[i] = none[i] = Integer.MAX_VALUE;
            if(A[i-1]<A[i] && B[i-1]<B[i]) {
                swap[i] = swap[i-1]+1;
                none[i] = none[i-1];
            }
            if(B[i-1]<A[i] && A[i-1]<B[i]) {
                swap[i] = Math.min(swap[i], none[i-1]+1);
                none[i] = Math.min(none[i], swap[i-1]);
            }
        }
        return Math.min(swap[len-1], none[len-1]);
    }
}