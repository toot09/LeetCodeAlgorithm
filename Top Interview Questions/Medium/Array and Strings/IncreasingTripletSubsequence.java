class IncreasingTripletSubsequence_TIQ {
    public boolean increasingTriplet(int[] nums) {
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n<=f) f=n;
            else if(n<=s) s=n;
            else return true;
        }
        return false;
    }
}